package my;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author 孟享广
 * @create 2020-06-20 7:20 下午
 */
public class Java9Test {
    @Test
    public void test1(){
        try {
            URL url = new URL("http://3.cn");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
