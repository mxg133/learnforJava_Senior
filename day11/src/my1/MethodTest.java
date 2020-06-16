package my1;

import java1.Person;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author 孟享广
 * @create 2020-06-16 3:09 下午
 */
public class MethodTest {
    @Test
    public void test(){
        Class<Person> clazz = Person.class;
        Method[] methods = clazz.getMethods();
        for (Method m:methods){
            System.out.println(m);
        }

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m:declaredMethods){
            System.out.println(m);
        }

    }
}
