package my1;

import java1_Java10.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 孟享广
 * @create 2020-06-17 1:50 下午
 */
public class ReflectionTest {
    @Test
    public void test1() throws Exception {
        Class<Person> clazz = Person.class;

        Person p = clazz.newInstance();

        Field id = clazz.getField("id");

        id.set(p, 1001);

       int pId = (int) id.get(p);
        System.out.println(pId);


    }

    @Test
    public void test2() throws Exception{
        Class<Person> clazz = Person.class;

        Person p = clazz.newInstance();

        Field name = clazz.getDeclaredField("name");

        name.set(p,"Tom");

        name.setAccessible(true);

        String str = (String) name.get(p);
        System.out.println(str);


    }
    @Test
    public void test3() throws Exception {
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();
        Method show = clazz.getDeclaredMethod("show", String.class);
        show.setAccessible(true);


        String str  = (String) show.invoke(person, "日本");
        System.out.println(str);

        Method showDesc = clazz.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        Object obj = showDesc.invoke(Person.class);
        System.out.println(obj);
    }
}
