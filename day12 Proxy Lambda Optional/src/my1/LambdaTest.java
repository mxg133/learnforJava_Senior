package my1;

import org.junit.Test;

import java.net.InetAddress;
import java.util.Comparator;

/**
 * @author 孟享广
 * @create 2020-06-18 11:06 上午
 */
public class LambdaTest {
    @Test
    public void test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱r1");
            }
        };
        r1.run();
        System.out.println("*******");

        Runnable r2 = () -> System.out.println("我爱r2");
        r2.run();

    }

    @Test
    public void test2() {
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);

            }
        };
        int compare = comparator.compare(12, 31);
        System.out.println(compare);

        Comparator<Integer> comparator1 = ((o1, o2) -> Integer.compare(o1,o2));
        int compare1 = comparator1.compare(12, 4);
        System.out.println(compare1);

        Comparator<Integer> comparator2 = Integer::compare;
        int compare2 = comparator1.compare(12, 4);
        System.out.println(compare2);
    }
}