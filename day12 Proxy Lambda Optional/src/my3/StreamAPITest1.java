package my3;

import java2_Java11.Employee;
import java2_Java11.EmployeeData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author 孟享广
 * @create 2020-06-19 1:29 下午
 */
public class StreamAPITest1 {
    @Test
    public void test1(){
        List<Employee> list = EmployeeData.getEmployees();

        Stream<Employee> stream = list.stream();
        stream.filter(e -> e.getSalary() > 7000).forEach(System.out::println);


       list.stream().limit(3).forEach(System.out::println);

        list.stream().skip(3).forEach(System.out::println);
        list.add(new Employee(1010, "刘强东", 40, 8000));
        list.add(new Employee(1010, "刘强东", 40, 8000));
        list.add(new Employee(1010, "刘强东", 40, 8000));
        list.add(new Employee(1010, "刘强东", 40, 8000));
        list.add(new Employee(1010, "刘强东", 40, 8000));
        list.stream().distinct().forEach(System.out::println);
    }
    @Test
    public void test2(){
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(s -> s.toUpperCase()).forEach(System.out::println);


        List<Employee> employees = EmployeeData.getEmployees();
        Stream<String> stream = employees.stream().map(Employee::getName);
        stream.filter(n -> n.length() > 3).forEach(System.out::println);

        Stream<Stream<Character>> streamStream = list.stream().map(StreamAPITest1::fromStringStream);
        streamStream.forEach(s -> {
            s.forEach(System.out::println);
        });

        Stream<Character> characterStream = list.stream().flatMap(StreamAPITest1::fromStringStream);
        characterStream.forEach(System.out::println);
    }
    public static Stream<Character> fromStringStream(String str){
        ArrayList<Character> list = new ArrayList<>();
        for (Character c: str.toCharArray()){
            list.add(c);
        }
       return list.stream();
    }
    @Test
    public void test3(){
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList list2 = new ArrayList();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        list1.addAll(list2);
        System.out.println(list1);

    }

    @Test
    public void test4(){
        List<Integer> list = Arrays.asList(12, 43, 65, 34, 87, 0, -98, 7);
        list.stream().sorted().forEach(System.out::println);


        List<Employee> list1 = EmployeeData.getEmployees();
        list.stream().sorted((e1,e2)-> Integer.compare(e1,e2)).forEach(System.out::println);










    }



}
