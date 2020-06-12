package my1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 孟享广
 * @create 2020-06-12 3:17 下午
 */
public class GenericTest {
    @Test
    public void test1(){
        Object obj = null;
        String str = null;
        obj = str;

        Object arr1[] = null;
        String arr2[] = null;
        arr1 = arr2;

        List<Object> list1 = null;
        List<String> list2 = null;
//        list1 = list2;

        show(list1);
        show1(list2);

    }
    public void show(List<Object> list){

    }
    public void show1(List<String> list){

    }

    @Test
    public void test2(){

        List<String> List1 = null;
        ArrayList<String> list2 = null;
        List1 = list2;


    }
    @Test
    public void test3(){
        List<Object> list1 = null;
        List<String> list2 = null;

        List<?> list = null;
        list = list1;
        list = list2;
//
//        print(list1);
//        print(list2);

        List<String> list3 = new ArrayList<>();
        list3.add("AA");
        list3.add("BB");
        list3.add("CC");

        list = list3;

        list.add(null);

        Object o = list.get(0);
        System.out.println(o);


    }
    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            Object pbj = iterator.next();
            System.out.println(pbj);
        }
    }

    @Test
    public void test4(){
        List<? extends Preson> list1 = null;
        List<? super  Preson> list2 = null;

        List<Student> list3 = null;
        List<Preson> list4 = null;
        List<Object>  list5 = null;

        list1 = list3;
        list1 = list4;
//        list1 = list5;

//        list2 = list3;
        list2 = list4;
        list2 = list5;

        Preson p = list1.get(0);

        list2 = list4;
        Object object = list2.get(0);

//        list1.add(new Student());
        list2.add(new Preson());
    }
}
