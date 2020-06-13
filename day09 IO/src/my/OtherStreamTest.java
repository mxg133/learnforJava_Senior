package my;

import org.junit.Test;

import javax.xml.crypto.dsig.dom.DOMSignContext;
import java.io.*;

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
    @Test
    public void test5() throws IOException {
//        DataOutputStream dos = new DataOutputStream(
//                new FileOutputStream("data1.txt")
//        );
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data1.txt"));
        dos.writeUTF("王圣唯");
        dos.flush();
        dos.writeInt(23);
        dos.flush();
        dos.writeBoolean(true);
        dos.flush();

        dos.close();

    }

    @Test
    public void test6() throws IOException {
        DataInputStream dis = new DataInputStream(
                new FileInputStream("data1.txt")
        );

        String s = dis.readUTF();
        int i = dis.readInt();
        boolean b = dis.readBoolean();


    }
}
