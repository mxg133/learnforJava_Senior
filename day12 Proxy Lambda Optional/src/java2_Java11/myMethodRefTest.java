package java2_Java11;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author 孟享广
 * @create 2020-06-19 9:17 上午
 */
public class myMethodRefTest {
    @Test
    public void test1(){
        Consumer<String> con1 = str -> System.out.println(str);
        con1.accept("beijing");

        System.out.println("$$$$$$$$$$$");

        PrintStream ps = System.out;
        Consumer<String> con2 = ps::println;
        con2.accept("beijing");

    }
    @Test
    public void test2(){
        Employee emp = new Employee(1001, " Tom", 23, 5600);
        Supplier<String> sup1 = emp::getName;
        System.out.println(sup1.get());
    }
    @Test
    public void test3(){
        Comparator<Integer>  con1 = (t1, t2) -> Integer.compare(t1, t2);
        int compare = con1.compare(12, 21);
        System.out.println(compare);

//        Integer integer = new Integer();
        Comparator<Integer>  con2 = Integer::compare;
        int compare1 = con2.compare(12, 3);
        System.out.println(compare1);
    }

    @Test
    public void test4(){
        Function<Double, Long> fun1 =  Math::round;
        Long aLong = fun1.apply(12.3);
        System.out.println(aLong);

        Function<Double, Long> fun2 = (t2) -> Math.round(t2);
        Long aLong1 = fun2.apply(12.3);
        System.out.println(aLong1);
    }

    @Test
    public void test5(){
        Comparator<String> com1 = (s1, s2) -> s1.compareTo(s2);
        int compare = com1.compare("abc", "abd");
        System.out.println(compare);

        Comparator<String> com2 = String::compareTo;
        int compare1 = com2.compare("abc", "abd");
        System.out.println(compare1);

    }
    @Test
    public void test6(){
        BiPredicate<String, String> biP1 = String::equals;
        boolean test = biP1.test("abc", "abc");
        System.out.println(test);

        BiPredicate<String, String> biP2 = (s1,s2) -> s1.equals(s2);
        boolean test1 = biP2.test("aba", "aba");
        System.out.println(test1);
    }

    @Test
    public void test7(){
        Employee emp = new Employee(1001, " Tom", 23, 5600);

        Function<Employee , String> fun1 = e -> e.getName();
        String apply = fun1.apply(emp);
        System.out.println(apply);

        Function<Employee , String> fun2 = Employee::getName;
        String apply1 = fun2.apply(emp);
        System.out.println(apply1);


    }




}
