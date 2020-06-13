package my;

import org.junit.Test;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author 孟享广
 * @create 2020-06-13 1:08 下午
 */
public class FileInputOutputStreamTest {

    @Test
    public void test1() {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(
                    new File("爱情与友情.jpg")
            );

            fos = new FileOutputStream(
                    new File("爱情与友情11.jpg")
            );

            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }



        }


    }

public void co(String src, String des){

    FileInputStream fis = null;
    FileOutputStream fos = null;
    try {
        fis = new FileInputStream(
                new File(src)
        );

        fos = new FileOutputStream(
                new File(des)
        );

        byte[] buffer = new byte[5];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            fos.write(buffer,0,len);
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (fos != null) {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

}
@Test
public void test3(){

    long s = System.currentTimeMillis();
    co("爱情与友情.jpg","爱情与友情22.jpg");
    long e = System.currentTimeMillis();


    long l = e - s;

    DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;//你们不记得了吧 哈啊哈
    String s1 = formatter.format(LocalDateTime.now());

    System.out.println(l);
}
}


