package console.Service;

import model.StudentTest;

import java.io.*;
import java.net.Socket;

public class ServiceTest implements Runnable {//创建多线程
    private InputStream input = null;
    private OutputStream output = null;

    private ObjectOutputStream obj = null;
    private PrintWriter pw = null;
    private Socket s = null;

    public ServiceTest(Socket s) {
        this.s = s;
    }

    public void run() {

        try {
            input = s.getInputStream ();
            output = s.getOutputStream ();


            obj = new ObjectOutputStream (output);

            pw = new PrintWriter (output);
            //发送一个整数
            obj.writeInt (1617);
            //发送一个浮点数
            obj.writeDouble (1213.1212);
            //发送一个学生对象
            StudentTest ss = new StudentTest(2232, "胡歌");
            obj.writeObject (ss);
            pw.flush ();
            obj.flush ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
