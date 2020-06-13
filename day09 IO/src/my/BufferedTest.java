package my;

import org.junit.Test;

import java.io.*;

/**
 * @author 孟享广
 * @create 2020-06-13 2:05 下午
 */
public class BufferedTest {

    @Test
    public void test1(){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(
                    new FileInputStream(
                            new File("爱情与友情.jpg")
                    )
            );

            bos = new BufferedOutputStream(
                    new FileOutputStream(
                            new File("爱情与友情33.jpg")
                    )
            );

            byte[] buffer = new byte[10];

            int lem;

            while (( lem = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, lem);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test4(){


    }
}
