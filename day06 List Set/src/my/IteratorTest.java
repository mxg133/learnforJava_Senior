package my;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 孟享广
 * @create 2020-06-10 10:57 上午
 */
public class IteratorTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        Person p = new Person("Jerry", 20);
        coll.add(p);
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator iterator = coll.iterator();

//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


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

        Iterator iterator = coll.iterator();

//        while (iterator.next() != null){
//            System.out.println(iterator.next());
//        }
        while (coll.iterator().hasNext()){
            System.out.println(coll.iterator().next());
        }
    }
    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        Person p = new Person("Jerry", 20);
        coll.add(p);
        coll.add(new String("Tom"));
        coll.add(false);
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if ("Tom".equals(obj)){
                iterator.remove();
            }
        }
        System.out.println(coll);

    }
}
