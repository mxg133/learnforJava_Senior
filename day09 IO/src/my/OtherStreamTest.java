package my;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 孟享广
 * @create 2020-06-13 4:31 下午
 */
public class OtherStreamTest {
    @Test
    public static void main(String[] args) {


//        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(System.in)
            );
            while (true) {
                String data = br.readLine();
                if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)){
                    break;
                }
                String upperCase = data.toUpperCase();
                System.out.println(upperCase);
            }
        } catch (IOException e) {


        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
