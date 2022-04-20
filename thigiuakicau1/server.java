package trandatkhanh_61133799;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server extends Thread {
	Socket socketClient;
	int id = -1;
	

	public server (Socket socketClient, int id) {
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
	void XoaFile(String tenFile) throws IOException{
		
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
		
	void TaoFile(String tenFile) throws IOException{
		
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
			while(true){
				String chuoinhan=buffR.readLine();
				System.out.print(chuoinhan);
			
				if (chuoi)
				{
					String chuoigui="chẵn";
					buffW.write(chuoigui+"");
					buffW.flush();
				
				}
				else if(s%2!=0){
					String chuoigui="lẻ";
					buffW.write(chuoigui+"");
					buffW.flush();
				
				}
				if(chuoinhan.equals("0")) {
					break;
				}
			}
			socketClient.close();
				}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	}