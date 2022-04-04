package dichso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        // Mở cổng và bắt đầu nghe
        ServerSocket socketServer = new ServerSocket (9999);
        System.out.println("I'm listening on 9999 port....");
        //
        int id=0;
       while (true) {
            Socket s =socketServer.accept();
           id ++;
            //new LuongLamViec(s, id++).start();
            client luongTask = new client(s, id);
            luongTask.start();
        }
    }
}