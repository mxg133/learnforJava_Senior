package my;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author 孟享广
 * @create 2020-06-15 10:22 上午
 */
public class FileUtilsTest {
    public static void main(String[] args) {

        File srcFile = new File("day10/爱情与友情.jpg");
        File destFile = new File("day10/爱情与友情22.jpg");
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
