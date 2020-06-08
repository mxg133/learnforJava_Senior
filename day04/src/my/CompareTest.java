package my;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;


/**
 * @author 孟享广
 * @create 2020-06-08 4:45 下午
 */
public class CompareTest {
    @Test
    public void test(){
        String arr[] = new String[]{
                "AA", "CC", "KK", "MM", "GG", "JJ", "DD"
        };
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void test1(){
        Goods arr[] = new Goods[4];
        arr[0] = new Goods("lenovoMouse", 34);
        arr[1] = new Goods("dellMouse",43);
        arr[2] = new Goods("xiaomiMouse",12);
        arr[3] = new Goods("huaweiMouse",65);
        arr[4] = new Goods("microsoftMouse",43);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    @Test
    public void test3(){
        String arr[] = new String[]{
                "AA", "CC", "KK", "MM", "GG", "JJ", "DD"
        };


        Arrays.sort(arr, new Comparator(){
            public int compare(Object o1, Object o2){
                if (o1 instanceof String && o2 instanceof String){
                    String s1 = (String)o1;
                    String s2 = (String)o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("不止一");
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test4(){
        Goods arr[] = new Goods[4];
        arr[0] = new Goods("lenovoMouse", 34);
        arr[1] = new Goods("dellMouse",43);
        arr[2] = new Goods("xiaomiMouse",12);
        arr[3] = new Goods("huaweiMouse",65);
        arr[4] = new Goods("microsoftMouse",43);

        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Goods && o2 instanceof Goods){
                    Goods g1 = (Goods)o1;
                    Goods g2 = (Goods)o2;
                    if (g1.getM_Name().equals(g2.getM_Name())){
                        return -Double.compare(g1.getM_Price(), g2.getM_Price());
                    }else {

                        return g1.getM_Name().compareTo(g2.getM_Name());
                    }

                }
                throw new RuntimeException("bu");
            }


    });
        System.out.println(Arrays.toString(arr));
    }














}
