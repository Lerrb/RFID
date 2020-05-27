package console;

import console.Service.ServiceTest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocket server = null;
        Socket s = null;

        try {
            server = new ServerSocket (8399);
            System.out.println ("监听用户连接......");
            while (true) {//客户端的端口正确才能接下去访问，否则要么等待要么报错
                s = server.accept ();//监听,阻塞连接
                System.out.println ("已监听到客户连接到[远程主机" + s.getRemoteSocketAddress ()
                        + ":端口" +
                        s.getPort () + "]");
                new Thread (new ServiceTest(s)).start ();
            }
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}
