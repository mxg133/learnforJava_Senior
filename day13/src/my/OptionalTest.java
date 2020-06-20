package my;

import org.junit.Test;

import java.util.Optional;

/**
 * @author 孟享广
 * @create 2020-06-20 4:01 下午
 */
public class OptionalTest {

    @Test
    public void test1(){
        Optional<Object> op1 = Optional.empty();
        if (!op1.isPresent()){
            System.out.println("空！");

        }
        System.out.println(op1);
        System.out.println(op1.isPresent());
//        System.out.println(op1.get());

    }
    @Test
    public void test2(){
        String str = "hello";
        str = null;
        Optional<String> op1 = Optional.of(str);
        String s = op1.get();
        System.out.println(s);

    }
    @Test
    public void test3(){
        String str = "beikjing!!!!";
        Optional<String> op1 = Optional.ofNullable(null);
        String str2 = op1.orElse("shanghai");
        System.out.println(str2);

    }
}
