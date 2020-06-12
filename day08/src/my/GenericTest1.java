package my;

import org.junit.Test;

/**
 * @author 孟享广
 * @create 2020-06-12 12:06 下午
 */
public class GenericTest1 {

    @Test
    public void test1(){
//默认
        Order<Object> order = new Order<>();
        order.setOrderT(123);
        order.setOrderT("ABC");


        Order<String> order1 = new Order<>("orderAA", 1001, "order:AA");
        order1.setOrderT("AA:hello");





    }
}
