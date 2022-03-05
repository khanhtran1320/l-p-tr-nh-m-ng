import java.util.Scanner;

public class Sanpham {
	private String tenSP;
	private double dongia;
	private double giamgia;
	 public double getthuenhapkhau() {
		return dongia*0.1;
	}
	public void nhap() {
		Scanner bp = new Scanner(System.in);
		System.out.print("nhap ten sp:");
		tenSP = bp.nextLine();
		System.out.print("nhap don gia sp:");
		dongia= bp.nextDouble();
		System.out.print("nhap giam gia sp:");
		giamgia=bp.nextDouble();
	}
	public void xuat() {
		System.out.println("ten sp:" + tenSP);
		System.out.println("gia sp:" + String.valueOf(dongia));
		System.out.println("giam gia:" + String.valueOf(giamgia));
		System.out.println("ten sp:" + String.valueOf(getthuenhapkhau()));
	}
}
