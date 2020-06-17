package my;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author 孟享广
 * @create 2020-06-16 1:04 下午
 */
public class ClassLoaderTest {




@Test
public void test(){
    Class<ClassLoaderTest> clazz = ClassLoaderTest.class;
    ClassLoader classLoader = clazz.getClassLoader();
    System.out.println(classLoader);
    ClassLoader classLoader1 = classLoader.getParent();
    System.out.println(classLoader1);

    ClassLoader classLoader2 = classLoader1.getParent();
    System.out.println(classLoader2);


    Class clazz1 = String.class;
    ClassLoader classLoader3 = clazz1.getClassLoader();
    System.out.println(classLoader3);


}

@Test
public void test2() throws Exception {
    Properties pros = new Properties();
//    FileInputStream fis = new FileInputStream("jdbc.properties");
//    pros.load(fis);


    Class<ClassLoaderTest> clazz = ClassLoaderTest.class;
    ClassLoader classLoader = clazz.getClassLoader();
    InputStream is = classLoader.getResourceAsStream("jdbc1.properties");
    pros.load(is);


    String user = pros.getProperty("user");
    String password = pros.getProperty("password");
    System.out.println(user + password);




}

}
