package my;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 孟享广
 * @create 2020-06-16 10:40 上午
 */
public class ReflectionTest {

    @Test
    public void test1(){
        Person p1 = new Person("tom", 12);
        p1.age = 10;
        System.out.println(p1);
        p1.show();

    }
    @Test
    public void test2() throws Exception {
        Class<Person> clazz = Person.class;

        Constructor<Person> cons = clazz.getConstructor(String.class, int.class);

        Person obj = cons.newInstance("Tom", 12);
        Person p = (Person)obj;
        System.out.println(p.toString());

        Field age = clazz.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p);

        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        Constructor<Person> cons1 = clazz.getDeclaredConstructor(String.class);
    }

    @Test
    public void test3() throws ClassNotFoundException {
        Class calzz = Person.class;
        System.out.println(calzz);

        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);

        Class<?> clazz3 = Class.forName("my.Person");
        System.out.println(clazz3);

        System.out.println(calzz == clazz2);
        System.out.println(calzz == clazz3);

        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("my.Person");
        System.out.println(clazz4);
    }
}
