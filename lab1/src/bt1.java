import java.util.Scanner;
public class bt1 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		String hoTen = nhap.nextLine();
		System.out.print("Điểm TB: ");
		double diemTB = nhap.nextDouble();
		System.out.printf("%s %.2f điểm", hoTen, diemTB);
		
	}

}
