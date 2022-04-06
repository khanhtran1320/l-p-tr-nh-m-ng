
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

	public static void main(String[] args) throws IOException {
		ServerSocket socketserver = new ServerSocket(123);
		System.out.print("I'm listening on port number 123...");
		int id=0;
		while(true) {
			Socket s = socketserver.accept();
			id++;
			LuongLamViec luongTask = new LuongLamViec(s,id);
			luongTask.start();
		}
	}
