package my;

import org.junit.Test;

import java.util.*;

/**
 * @author 孟享广
 * @create 2020-06-12 10:53 上午
 */
public class GenericTest {
    @Test
    public void test1(){
//        ArrayList list = new ArrayList();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88);

//        list.add("TOM");
//        for (Integer score: list){
//
////            int st = (Integer)   score;
//            System.out.println(score);

            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()){
                Integer next = iterator.next();
                System.out.println(next);
            }

        }
    @Test
    public void test3(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("TOM", 45);
        map.put("T2M", 75);
        map.put("T3M", 35);

//        map.put(23 "ad");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();

            System.out.println(next.getKey()  + "-" + next.getValue());
        }


    }

}

