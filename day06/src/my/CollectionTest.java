package my;

import org.junit.Test;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author 孟享广
 * @create 2020-06-10 9:47 上午
 */
public class CollectionTest {

    @Test
    public void test(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        Person p = new Person("Jerry", 20);
        coll.add(p);

        boolean contains = coll.contains(123);

        System.out.println(contains);
        System.out.println(coll.contains(new String("Tom"))     );
        System.out.println(coll.contains(p));
        System.out.println(coll.contains(new Person("Jerry", 20)));


        Collection coll1 = Arrays.asList(123, 456);


        System.out.println(coll.containsAll(coll1));
    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        Person p = new Person("Jerry", 20);
        coll.add(p);
        coll.add(new String("Tom"));
        coll.add(false);

        boolean remove = coll.remove(123);
        System.out.println(remove);
        System.out.println(coll);
    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        Person p = new Person("Jerry", 20);
        coll.add(p);

        Collection coll1 = Arrays.asList(123, 456, 789);

        boolean r = coll.retainAll(coll1);

        System.out.println(coll);

        System.out.println(coll.hashCode());


    }
    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        Person p = new Person("Jerry", 20);
        coll.add(p);


        System.out.println(coll.hashCode());

        Object[] array = coll.toArray();
        for (int i = 0; i  < array.length; i++){
            System.out.println(array[i]);
        }

        List<String> list = Arrays.asList(new String[]{"aa", "bb", "cc"});
        System.out.println(list);

        List<Integer> integers = Arrays.asList(new Integer[]{123, 456});
        System.out.println(integers);

    }


}
