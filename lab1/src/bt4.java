import java.util.Scanner;
public class bt4 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap a: ");
		double a = nhap.nextInt();
		System.out.print("Nhap b: ");
		double b = nhap.nextInt();
		System.out.print("Nhap c: ");
		double c = nhap.nextInt();
		
		System.out.println("can bac 2 cua delta: " + Math.sqrt(b*b- 4*a*c));

	}

}
