package my1;

import java1_Java10.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;

/**
 * @author 孟享广
 * @create 2020-06-17 12:41 下午
 */
public class OtherTest {
    @Test
    public void test1(){
        Class<Person> clazz = Person.class;
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor c: constructors){
            System.out.println(c);
        }

        System.out.println();
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor c: declaredConstructors)   {
            System.out.println(c);
        }

    }
    @Test
    public void test2(){
        Class<Person> clazz = Person.class;
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);



    }
}
