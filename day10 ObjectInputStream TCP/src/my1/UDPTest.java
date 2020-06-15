package my1;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * @author 孟享广
 * @create 2020-06-15 1:35 下午
 */
public class UDPTest {
    @Test
    public void test1() throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String str = "发送！";
        byte[] data = str.getBytes();
        InetAddress inet = InetAddress.getLocalHost();
        DatagramPacket packet = new DatagramPacket(data,0,data.length, inet, 9090);

        socket.send(packet);
        socket.close();

    }


    @Test
    public void test2() throws IOException {
        DatagramSocket socket = new DatagramSocket(9090);

        byte[] buffer = new byte[100];

        DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);

        socket.receive(packet);
        System.out.println(new String(packet.getData(), 0,packet.getLength() ));
        socket.close();
    }
}
