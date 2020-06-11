package my;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author 孟享广
 * @create 2020-06-11 9:22 上午
 */
public class EmployeeTest {
    @Test
    public void test1(){

        TreeSet set = new TreeSet();

        Employee e1 = new Employee("liudahua", 55, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("zhangxueyou",43,new MyDate(1987,5,4));
        Employee e3 = new Employee("guofucheng",44,new MyDate(1987,5,9));
        Employee e4 = new Employee("liming",51,new MyDate(1954,8,12));
        Employee e5 = new Employee("liangzhaowei",21,new MyDate(1978,12,4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test2(){

        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee)o2;

                    MyDate b1 = e1.getM_Birthday();
                    MyDate b2 = e2.getM_Birthday();

                    int minusYear = b1.getM_Year() - b2.getM_Year();
                    if (minusYear != 0){
                        return minusYear;
                    }

                    int minusMouth = b1.getM_Mouth() - b2.getM_Mouth();
                    if (minusMouth != 0){
                        return minusMouth;
                    }

                    return b1.getM_Day()- -b2.getM_Day();

                }
                throw new RuntimeException("垃圾！");
            }
        });

        Employee e1 = new Employee("liudahua", 55, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("zhangxueyou",43,new MyDate(1987,5,4));
        Employee e3 = new Employee("guofucheng",44,new MyDate(1987,5,9));
        Employee e4 = new Employee("liming",51,new MyDate(1954,8,12));
        Employee e5 = new Employee("liangzhaowei",21,new MyDate(1978,12,4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
