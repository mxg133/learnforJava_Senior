package my;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

/**
 * @author 孟享广
 * @create 2020-06-15 9:14 上午
 */
public class RandomAccessFileTest {
    @Test
    public void test1()  {

        RandomAccessFile raf11 = null;
        RandomAccessFile raf2 = null;
        try {
            raf11 = new RandomAccessFile(
                    new File("爱情与友情.jpg"), "r"
            );
            raf2 = new RandomAccessFile(
                    new File("爱情与友情11.jpg"), "rw"
            );


            byte[] buffer = new byte[1024   ];
            int len;
            while ((len = raf11.read(buffer )) != -1){
                raf2.write(buffer, 0 ,len );

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf11 != null) {
                try {
                    raf11.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                if (raf2 != null) {
                    try {
                        raf2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
    @Test
    public void test2() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("hello.txt", "rw");
        raf1.write("XYZ".getBytes());

        raf1.close();

    }
}
