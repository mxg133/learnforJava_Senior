package my;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 孟享广
 * @create 2020-06-10 2:14 下午
 */
public class SetTest {

    @Test
    public void test1(){
        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add(123);
        set.add(123);
        set.add("AA");
        set.add("CC")   ;
        set.add(new Person("Tom", 12)   );
        set.add(new Person("Tom", 12)   );
        set.add(129);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(set.size());


    }



}
