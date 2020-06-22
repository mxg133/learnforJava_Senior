package my3;

import java2_Java11.Employee;
import java2_Java11.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 孟享广
 * @create 2020-06-19 2:58 下午
 */
public class StreamAPITest2 {
    @Test
    public void test1(){
        List<Employee> employees = EmployeeData.getEmployees();
        boolean allMatch = employees.stream().allMatch(e -> e.getAge() > 18);
        System.out.println(allMatch);

        boolean anyMatch = employees.stream().anyMatch(e -> e.getSalary() > 10000);
        System.out.println(anyMatch);

        boolean noneMatch = employees.stream().noneMatch(e -> e.getName().startsWith("雷"));
        System.out.println(noneMatch);
        Optional<Employee> employee = employees.stream().findFirst();
        System.out.println(employee);
        Optional<Employee> employee1 = employees.parallelStream().findFirst();
        System.out.println(employee1);
        System.out.println();

    }
    @Test
    public void test2(){
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Double> stream = employees.stream().map(Employee::getSalary);
        Optional<Double> max = stream.max(Double::compareTo);
        System.out.println(max);

        Optional<Employee> min = employees.stream().min(((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())));
        System.out.println(min);

        employees.stream().forEach(System.out::println);
        System.out.println("11111");
        employees.forEach(System.out::println);


    }
    @Test
    public void test3(){
        System.out.println();
        List<Integer> list  = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);
        List<Employee> list1 = EmployeeData.getEmployees();
        Stream<Double> doubleStream = list1.stream().map(employee -> employee.getSalary());
        Optional<Double> reduce1 = doubleStream.reduce(Double::sum);
        System.out.println(reduce1);

    }
    @Test
    public void test4(){
        List<Employee> list = EmployeeData.getEmployees();
        List<Employee> list1 = list.stream().filter(e->e.getSalary() > 6000).collect(Collectors.toList());
        list1.forEach(System.out::println);




    }


}
