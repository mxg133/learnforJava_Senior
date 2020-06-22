package my1;

import java1_Java10.Person;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @author 孟享广
 * @create 2020-06-16 2:55 下午
 */
public class FieldTest {
    @Test
    public void test1(){
        Class<Person> clazz = Person.class;

        Field[] fields = clazz.getFields();

        for (Field f: fields){
            System.out.println(f);
        }

        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f: declaredFields){
            System.out.println(f);
        }

    }
    @Test
    public void test2(){
        Class<Person> clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f: declaredFields){
            int modifiers = f.getModifiers();
            System.out.println(modifiers);
        }


    }
}
