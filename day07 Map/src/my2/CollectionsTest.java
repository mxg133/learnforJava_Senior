package my2;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author 孟享广
 * @create 2020-06-11 1:42 下午
 */
public class CollectionsTest {

    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(765);
        list.add(765);
        list.add(-97);
        list.add(0);

        System.out.println(list);

//        Collections.reverse(list);

//        Collections.shuffle(list);

//        Collections.sort(list);

//        Collections.swap(list, 1,  2);

        System.out.println(Collections.frequency(list, 765));

        System.out.println(list);
    }
    @Test
    public void test2(){
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(-97);
        list.add(0);
//        List dest = new ArrayList();
        List dest = Arrays.asList(new Object[list.size()]);
        Collections.copy(dest, list);
        System.out.println(list);

        List list1 = Collections.synchronizedList(list);

    }


}
