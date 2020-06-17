package my1;

import java1.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

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
    @Test
    public void test2(){
        Class<Person> clazz = Person.class;
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m: declaredMethods){
            Annotation[] annotations = m.getAnnotations();
            for (Annotation a: annotations){
                System.out.println(a);
            }
            int modifiers = m.getModifiers();
            System.out.println(Modifier.toString(modifiers) + "\t");
            System.out.println();

            Class<?> returnType = m.getReturnType();
            System.out.println(returnType.getName() + "\t");

            String name = m.getName();
            System.out.println(name);

            Class<?>[] parameterTypes = m.getParameterTypes();
            if (!(parameterTypes == null && parameterTypes.length == 0)){
                for (int i = 0; i< parameterTypes.length; i++){
                    String name1 = parameterTypes[i].getName();
                    System.out.println(name1 + "args_" + i);
                }
            }
            Class<?>[] exceptionTypes = m.getExceptionTypes();
            if (!(exceptionTypes == null && exceptionTypes.length == 0)){
                for (int i = 0; i< exceptionTypes.length; i++){

                    String name1 = exceptionTypes[i].getName();
                    System.out.println(name1);
                }
            }
        }


    }
}
