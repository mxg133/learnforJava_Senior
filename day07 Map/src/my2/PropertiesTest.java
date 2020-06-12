package my2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * @author 孟享广
 * @create 2020-06-11 1:23 下午
 */
public class PropertiesTest {

    public static void main(String[] args) throws Exception {
        Properties pros = new Properties();
        FileInputStream fis = new FileInputStream("jdbc.properties");
        pros.load(fis);

        String name = pros.getProperty("name");
        String password = pros.getProperty("password");

        System.out.println(name + " " + password);

        fis.close();
    }




}
