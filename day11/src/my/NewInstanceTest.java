package my;

import org.junit.Test;

import java.Person;
import java.util.Random;

/**
 * @author 孟享广
 * @create 2020-06-16 1:57 下午
 */
public class NewInstanceTest {
    @Test
    public void test() throws IllegalAccessException, InstantiationException {
        Class<Person> clazz = Person.class;
        Person obj = clazz.newInstance();
        System.out.println(obj);






    }
@Test
public void test2(){
    Random random = new Random();
    int num = random.nextInt(3);
    String path = "";
    switch (num){
        case 0:
            path = "java.util.Date";
            break;
        case 1:
            path = "java.sql.Date";
            break;
        case 2:
            path = "java.Person";
            break;
    }
    try {
        Object obj = getIns(path);
    } catch (Exception e) {
        e.printStackTrace();
    }

}
public Object getIns(String path) throws Exception {
    Class<?> clazz = Class.forName(path);
    Object obj = clazz.newInstance();
    return obj;


}
}
