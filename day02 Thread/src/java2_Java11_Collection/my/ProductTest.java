package java2_Java11_Collection.my;

/**
 * @author 孟享广
 * @create 2020-06-04 1:43 下午
 */
class Clerk{
    private static int m_pro = 0;

    public synchronized void produceProduct() {
//        notify();
        if (m_pro < 20){
            m_pro++;
            System.out.println(Thread.currentThread().getName() + "开始生产，第：" + m_pro + "个");
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumeProduct() {
//        notify();
        if (m_pro > 0) {

            System.out.println(Thread.currentThread().getName() + "开始消费，第：" + m_pro + "个");
            m_pro--;
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始生产产品！");
        while (true){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.produceProduct();
        }
    }
}

class Consumer extends Thread{
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始消费产品！");
        while (true){

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.consumeProduct();
        }
    }
}
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        p1.setName("生产者1");

        Consumer c1 = new Consumer(clerk);
        c1.setName("消费者1");

        Consumer c2 = new Consumer(clerk);
        c2.setName("消费者2");

        p1.start();

        c1.start();
        c2.start();
    }
}
