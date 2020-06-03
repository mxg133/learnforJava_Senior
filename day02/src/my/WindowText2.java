package my;

/**
 * @author 孟享广
 * @create 2020-06-03 10:23 上午
 */

class window2 extends Thread {
    private static int m_ticket = 10;
        static Object obj  =   new Object();

    @Override

    public void run() {
        while (true) {
synchronized (this) {
            if (m_ticket > 0) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "卖票，号码为：" + m_ticket);

                m_ticket--;

            } else {
                break;
            }
        }}
    }
}

public class WindowText2 {
    public static void main(String[] args) {
        window2 t1 = new  window2();
        window2 t2 = new  window2();
        window2 t3 = new  window2();
        t1.setName("1号技师");
        t2.setName("2号技师");
        t3.setName("3号技师");

        t1.start();
        t2.start();
        t3.start();
    }
}
