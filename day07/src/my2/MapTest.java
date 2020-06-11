package my2;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;

/**
 * @author 孟享广
 * @create 2020-06-11 10:49 上午
 */
public class MapTest {
    @Test
    public void test1(){
        Map map = new HashMap();

//        map = new Hashtable();
        map.put(null, null);

    }

    @Test
    public void test3(){

        Map map = new HashMap();
        map.put("AA", 123);
        map.put(45,123);
        map.put("BB",56);
        map.put("AA",87);

        System.out.println(map);

        Map map1 = new HashMap();
        map1.put("CC",123);
        map1.put("DD",123);

        map.putAll(map1);

        System.out.println(map);


        Object remove = map.remove("CC");

        System.out.println(remove);
        System.out.println(map);

        map.clear();


        System.out.println(map.size());
        System.out.println(map);


    }
    @Test
    public void test4(){
        Map map = new HashMap();
        map.put("AA", 123);
        map.put(45,123);
        map.put("BB",56);

        Object o = map.get(45);
        System.out.println(o);

        System.out.println(map.containsKey("BB"));
        System.out.println(map.containsValue(123));

        System.out.println(map.isEmpty());

        Map map1 = new HashMap();
        map1.put("AA", 123);
        map1.put(45,123);
        map1.put("BB",56);

        System.out.println(map.equals(map1));

    }

    @Test
    public void test6(){
        Map map = new HashMap();
        map.put("AA", 123);
        map.put(45,1234);
        map.put("BB",56);

        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("8888888888888888888888");
        Collection values = map.values();
        for (Object o: values){
            System.out.println(o);
        }

        System.out.println("8888888888888888888888888");

        Set set1 = map.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            Object o = iterator1.next();
            Map.Entry entry = (Map.Entry)o;
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }


    }
}
