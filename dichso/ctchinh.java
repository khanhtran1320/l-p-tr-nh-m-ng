import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;



public class ctchinh {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket socketServer = new ServerSocket(9999);
		System.out.print("Tôi lắng nghe trong cổng 9999  ...");
		int id =0;
		while(true) {
			Socket s = socketServer.accept();
			//new LuongLamViec(s, id++).start();
			client luongTask = new client(s, id);
			luongTask.start();
		}
	}
}