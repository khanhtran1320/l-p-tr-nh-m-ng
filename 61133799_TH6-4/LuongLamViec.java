import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class LuongLamViec extends Thread{
	Socket socketClient;
	int id = -1;
	

	public LuongLamViec(Socket socketClient, int id) {
		super();
		this.socketClient = socketClient;
		this.id = id;
}
	void GuiFile(String tenFile) throws IOException{
		
		FileReader fr = new FileReader(tenFile);
		BufferedReader buffRead = new BufferedReader(fr);
		OutputStream osToClient = socketClient.getOutputStream();	
		OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
		BufferedWriter buffW = new BufferedWriter(write2Client);
		String line;
		while((line = buffRead.readLine()) != null) {
			buffW.write(line);
			buffW.flush();
		}
		fr.close();
		
	}
	@Override
	public void run() {
		try {
			System.out.print(socketClient.getInetAddress().getHostAddress());
			System.out.print(id);
			OutputStream osToClient = socketClient.getOutputStream();	
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(write2Client);
			InputStream in = socketClient.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffR = new BufferedReader(inReader);
			while(true) {
				String chuoiNhan=buffR.readLine();
				System.out.print("\n"+chuoiNhan);
				if(chuoiNhan.equals("1")) {
					GuiFile("D:\\1.txt");}
				if(chuoiNhan.equals("2")) {
					GuiFile("D:\\2.txt");
				}if(chuoiNhan.equals("3")) {
					GuiFile("D:\\3.txt");
				}if(chuoiNhan.equals("4")) {
					GuiFile("D:\\4.txt");
				}if(chuoiNhan.equals("5")) {
					GuiFile("D:\\5.txt");
				}if(chuoiNhan.equals("6")) {
					GuiFile("D:\\6.txt");
				}if(chuoiNhan.equals("7")) {
					GuiFile("D:\\7.txt");
				}if(chuoiNhan.equals("8")) {
					GuiFile("D:\\8.txt");
				}if(chuoiNhan.equals("9")) {
					GuiFile("D:\\9.txt");
				}if(chuoiNhan.equals("10")) {
					GuiFile("D:\\10.txt");
				}
				socketClient.close();
			}
		
	
	}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}
	}
	}