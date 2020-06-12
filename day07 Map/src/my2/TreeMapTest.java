package my2;

import org.junit.Test;

import java.util.*;

/**
 * @author 孟享广
 * @create 2020-06-11 1:10 下午
 */
public class TreeMapTest {

    @Test
    public void test1(){
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User){
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                }
                throw new RuntimeException("111111");
            }
        });
        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry",32);
        User u3 = new User("Jack",20);
        User u4 = new User("Rose",18);
        map.put(u1, 98);
        map.put(u2,89);
        map.put(u3,76);
        map.put(u4,100);

//        System.out.println(map);

        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }

}
