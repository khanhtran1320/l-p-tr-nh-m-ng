import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPDiscard_Server {

	public static void main(String[] args) throws IOException {
		// lắng nghe cổng 9
		DatagramSocket server = new DatagramSocket(9);

		// chuẩn bị vùng nhớ 
		byte[] buffer = new byte[1000];
		DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
		while(true)
		{
			// nhận về , đưa vào packet UDP 
			server.receive(packet);
			// trích thông tin ra, mảng byte data nhận được thành chuỗi
			// từ byte đầu tiên đến byte uối cùng
			String s = new String(packet.getData( ), 0, packet.getLength( ));
			// in ra màn hình để xem
			System.out.println(packet.getAddress( ) + " at port "
					 + packet.getPort( ) + " says " + s);
		}
		
	}

}