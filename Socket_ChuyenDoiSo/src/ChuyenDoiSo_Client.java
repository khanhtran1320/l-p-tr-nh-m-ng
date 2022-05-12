import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChuyenDoiSo_Client {
	public static void main(String[] args) {
		try {
			
			Socket socket = new Socket("localhost",9999);
			System.out.print("Conected!");
			InputStream in = socket.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffR = new BufferedReader(inReader);

			OutputStream osToClient = socket.getOutputStream();	
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(write2Client);

			Scanner banPhim = new Scanner(System.in);
			while(true) {
				System.out.print("\nClient:");
				String chuoiGui = banPhim.nextLine();
				buffW.write(chuoiGui+"\n");
				buffW.flush();
				String chuoiNhan = buffR.readLine();
				System.out.print("Server: "+ chuoiNhan);
				if(chuoiGui.equals("10")) break;
			}
			socket.close();
			
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
	}

}
