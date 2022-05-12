import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/*
 * liên tục guier Datagram packet đến một máy HostABC nào đó
 * 100 gói
 */
public class UDPDiscard_Client {

	public static void main(String[] args) throws IOException {
		String hostABC = "localhost";
		
		try {
			DatagramSocket Socket = new DatagramSocket( );
			int dem = 0;
			while(true)
			{
				// lấy dữ liệu từ bàn phím
				System.out.print("UDP client: ");
				Scanner bp = new Scanner(System.in);
				String theLine = bp.nextLine();
				
				// chuyển thành mảnh byte
				byte[] buff = theLine.getBytes();
				// đóng gói vào UDP Datagram
				DatagramPacket datagramPacket = new DatagramPacket(buff, buff.length);
				//cài đặt thống tin gói
				//InetAddress addressABC = InetAddress.getByName(hostABC);
				InetAddress addressABC = InetAddress.getByName(hostABC);				
				datagramPacket.setAddress(addressABC); 
				datagramPacket.setPort(9);
				//gửi đi
				Socket.send(datagramPacket);
				if(dem < 100) dem++;
				else break;
			}
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}