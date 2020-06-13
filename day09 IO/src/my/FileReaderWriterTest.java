package my;

import org.junit.Test;

import java.io.*;

/**
 * @author 孟享广
 * @create 2020-06-13 11:21 上午
 */
public class FileReaderWriterTest {
    @Test
    public void test1()  {
        FileReader fr = null;
        try {
            File file = new File("hello.txt");

            fr = new FileReader(file);

//        int data = fr.read();
//        System.out.println((char) data);
//        System.out.println((char) data);
//        System.out.println((char) data);
//        while (data != -1){
//            System.out.print((char) data);
//            data = fr.read();
//        }

            int data;
            while ((data = fr.read()) != -1){
                System.out.println((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test2() throws IOException {
///try
        File file = new File("hello.txt");
        FileReader   fr = new FileReader(file);
        char cbuf[] = new char[5];
        int len;
        while ((len = fr.read(cbuf)) != -1){
            for (int i = 0; i <  len ; i++ ){
                System.out.print(cbuf[i]);
            }
        }
        fr.close();
    }

    @Test
    public void test3() throws IOException {
        FileWriter fw = new FileWriter(
                new File("hello11.txt"), true
        );

        fw.write("埃及大吉哦收费哦啊叫啊诶放假啊诶哦哦弄UI呢米哦：电费、\n");
        fw.write("345678uyhtgrfedw哦弄UI呢米fgrf\n");
        fw.write("adefsrgdhtfyjguk345678uyhtgrfedw哦弄UI呢米fgrf\n");
        fw.close();


    }
    @Test
    public void test4() throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(
                    new File("hello.txt")
            );
            fw = new FileWriter(
                    new File("hello22.txt")
            );

            char[] cbuf = new char[5];

            int ien;

            while ((ien = fr.read(cbuf)) != -1){
                fw.write(cbuf, 0,ien);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {


                fw.close();



            fr.close();

        }





    }
}
