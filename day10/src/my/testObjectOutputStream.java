package my;

import org.junit.Test;

import java.io.*;

/**
 * @author 孟享广
 * @create 2020-06-14 3:30 下午
 */
public class testObjectOutputStream {
    @Test
    public void test1(){

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream("object1.dat")
            );

            oos.writeObject(new String("我爱川普"));
            oos.flush();

            oos.writeObject(new Person("自我", 23));
            oos.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }@Test
    public void test2(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(
                    new FileInputStream("object1.dat")
            );

            String str = (String) ois.readObject();

            Person p = (Person) ois.readObject();

            System.out.println(str);
            System.out.println(p);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
