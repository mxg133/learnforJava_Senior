package my1;

import org.junit.Test;

/**
 * @author 孟享广
 * @create 2020-06-18 11:42 上午
 */
public class LambdaTest1v {
    @Test
    public void test1(){
        Runnable runnable = () -> System.out.println("haha" );
        runnable.run();


    }
    @Test
    public void test2(){


    }
}
