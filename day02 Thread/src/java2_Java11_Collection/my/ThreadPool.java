package java2_Java11_Collection.my;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author 孟享广
 * @create 2020-06-05 10:01 上午
 */
class NumberThread implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "小1");
    }
}

class NumberThread1 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "大1");
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);


        ThreadPoolExecutor service1 = (ThreadPoolExecutor)service;

//        System.out.println(service.getClass());

service1.setCorePoolSize(15);




        service.execute(new NumberThread());
        service.execute(new NumberThread1());


        service.shutdown();



    }
}
