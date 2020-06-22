package java2_Java11;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author 孟享广
 * @create 2020-06-19 11:17 上午
 */
public class myConstructorRefTest {
    @Test
    public void test1(){
        Supplier<Employee> sup1 = () -> new Employee();
        sup1.get();

        Supplier<Employee> sup2 = Employee::new;
        sup2.get();
    }
    @Test
    public void test2(){
        Function<Integer, Employee> fun1 = t1 -> new Employee(t1);
        Employee apply = fun1.apply(12);
        System.out.println(apply);

        Function<Integer, Employee> fun2 = Employee::new;
        Employee employee = fun2.apply(1002);
        System.out.println(employee);

    }
    @Test
    public void test3(){

        BiFunction<Integer, String, Employee> bi1 = (t1, t2) -> new Employee(t1,t2);
        Employee apply = bi1.apply(1003, "TOM");
        System.out.println(apply);

        BiFunction<Integer, String, Employee> bi2 = Employee::new;
        Employee aj = bi2.apply(1111, "AJ");
        System.out.println(aj);


    }
    @Test
    public void test4(){
        Function<Integer, String[]> f1 = l1 -> new String[l1];
        String[] str = f1.apply(10);
        System.out.println(Arrays.toString(str));

        Function<Integer, String[]> f2 = String[]::new;
        String[] apply = f2.apply(4);
        System.out.println(Arrays.toString(apply));


    }
}
