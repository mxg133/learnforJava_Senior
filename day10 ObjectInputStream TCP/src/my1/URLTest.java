package my1;

import com.sun.tools.javac.Main;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author 孟享广
 * @create 2020-06-15 2:10 下午
 */
public class URLTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/examples/beauty.jpg?username=Tom");



        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
