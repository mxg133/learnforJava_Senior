package my;

import java1_Java10.User;
import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author 孟享广
 * @create 2020-06-10 3:38 下午
 */
public class TreeSetTest {

    @Test
    public void test1(){
        TreeSet set = new TreeSet();
//        set.add(123);
//        set.add(456);
//        set.add("AA");
//        set.add(new Person("Tom", 12));

//                set.add(34);
//        set.add(-34);
//        set.add(43);
//        set.add(11);
//        set.add(8);

        set.add(new User("Tom",12));
        set.add(new User("Jerry",32));
        set.add(new User("Jim",2));
        set.add(new User("Mike",65));
        set.add(new User("Jack",33));
        set.add(new User("Jack",56));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }



}
