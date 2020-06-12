package myfile;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author 孟享广
 * @create 2020-06-12 4:51 下午
 */
public class FileTest {
    @Test
    public void test1(){
        File file = new File("Hello.txt");

    }

    @Test
    public void test2(){

        File file1 = new File("hello.txt");
        File file2 = new File("d:\\io\\hi.txt");

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(new Date(file1.lastModified()));

        System.out.println();

        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());

    }
    @Test
    public void test3() throws IOException {
        File file = new File("nihao.txt");
        file.createNewFile();

    }









}
