import java.util.Scanner;
public class bt2 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap chieu dai: ");
		double dai = nhap.nextInt();
		System.out.print("Nhap chieu rong: ");
		double rong = nhap.nextInt();
		System.out.println("Chu vi la: " + ((dai + rong)*2));
		System.out.println("Dien tich la: " + (dai * rong));
		System.out.println("Canh nho nhat la :" + Math.min(dai, rong)); 
	}

}
