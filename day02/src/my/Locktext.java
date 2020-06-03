package my;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 孟享广
 * @create 2020-06-03 12:29 下午
 */


class Window implements Runnable {
    private int m_ticket = 20;

    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();

                if (m_ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "号，卖票 号：" + m_ticket);
                    m_ticket--;
                } else {
                    break;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}
public class Locktext {
    public static void main(String[] args) {
        Window w = new Window();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("1号");
        t2.setName("2号");
        t3.setName("3号");

        t1.start();
        t2.start();
        t3.start();

    }



}
