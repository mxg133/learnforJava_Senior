package my3;

import java2_Java11.Employee;
import java2_Java11.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author 孟享广
 * @create 2020-06-19 12:21 下午
 */
public class StreamAPITest {

    @Test
    public void test1(){
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Employee> stream = employees.stream();
        Stream<Employee> employeeStream = employees.parallelStream();



    }
    @Test
    public void test2(){
        int a[] = {1,2,3,4,5,6};
        IntStream stream = Arrays.stream(a);
        Employee emp1 = new Employee(1001,"Tom",23,5600);
        Employee emp2 = new Employee(1001,"Tom",23,5600);
        Employee arr1[] = new Employee[]{emp1, emp2};
        Stream<Employee> stream1 = Arrays.stream(arr1);
    }
    @Test
    public void test3(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);

    }
    @Test
    public void test4(){
        Stream.iterate(0, t -> t+2).limit(10).forEach(System.out::println);

    }
}
