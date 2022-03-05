import java.util.Scanner;
public class bt3 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap chieu dai canh: ");
		int canh = nhap.nextInt();
		System.out.println("The tich hinh lap phuong: " + (Math.pow(canh, 3)));

	}

}
