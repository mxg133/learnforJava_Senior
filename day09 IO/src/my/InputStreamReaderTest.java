package my;

import org.junit.Test;

import javax.imageio.IIOException;
import java.io.*;

/**
 * @author 孟享广
 * @create 2020-06-13 3:30 下午
 */
public class InputStreamReaderTest {
    @Test
    public void test1() throws IOException {

        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("dbcp.txt"),"UTF-8"
        );

        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("dbcp_gbk1.txt"), "gbk"
        );

        char[] cbuf = new char[20];
        int len;
        while ((len = isr.read(cbuf)) != -1){
            osw.write(cbuf,0,len);
        }


        isr.close();
        osw.close();
    }
}
