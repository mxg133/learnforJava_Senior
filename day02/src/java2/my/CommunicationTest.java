package java2.my;

/**
 * @author 孟享广
 * @create 2020-06-04 12:58 下午
 */
class Number implements Runnable{
    private int m_numnber = 1;
    @Override
    public void run() {

        while (true){
            synchronized (this) {

                notify();

                if (m_numnber <= 10) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + " 已被干：" + m_numnber + "次");
                    m_numnber++;

                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                } else {
                    break;

                }

            }
        }

    }
}
public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();

        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("1号女技师");
        t2.setName("2号女技师");

        t1.start();
        t2.start();

    }
}
