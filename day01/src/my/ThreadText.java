package my;

import java.util.Arrays;

/**
 * @author 孟享广
 * @create 2020-06-01 11:11 上午
 */


 class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println( Thread.currentThread().getName() +  i +"  优先级："+ Thread.currentThread().getPriority() + ",");
            }

            }
        }
    }


public class ThreadText {

    public static void main(String[] args) {
        MyThread t2 = new MyThread();


        Thread t1 = new Thread(t2);
        t1.setName("线程一");
        t1.start();
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() +  i +"  优先级："+ Thread.currentThread().getPriority() + ",");
            }

        }
//        t2.start();
        System.out.println(t1.isAlive());
    }




}
