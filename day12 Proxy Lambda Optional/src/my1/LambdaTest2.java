package my1;

/**
 * @author 孟享广
 * @create 2020-06-18 12:15 下午
 */


import org.junit.Test;

import java.util.function.Consumer;

public class LambdaTest2{
    @Test
    public void test1(){
        Happytime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("哈哈哈哈哈哈哈哈1111111" + aDouble);
            }
        });

        Happytime(400, mony -> System.out.println("哈哈哈哈哈哈哈哈1111111" + mony));

    }
    public void Happytime(double money, Consumer<Double> consumer){
        consumer.accept(money);
    }
}
