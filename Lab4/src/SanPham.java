import java.util.Scanner;

public class SanPham {
	private String tenSP;
	private double donGia;
	private double giamGia;
	
	public SanPham(String _tenSP, double _donGia, double _giamGia)
	{
		tenSP=_tenSP;
		donGia= _donGia;
		giamGia=_giamGia;
	}
	
	private double getthuenhapkhau()
	{
		return donGia*0.1;
	}
	
	public void nhap() {
		Scanner bp=new Scanner(System.in);
		System.out.print("Nhap ten san pham: ");
		tenSP = bp.nextLine();
		System.out.print("Nhap don gia san pham: ");
		donGia = bp.nextDouble();
		System.out.print("Nhap giam gia san pham: ");
		giamGia = bp.nextDouble();
	}
	
	public void xuat() {
		System.out.println("Ten san pham: " + tenSP);
		System.out.println("Gia: " + String.valueOf(donGia));
		System.out.println("Giam gia: " + String.valueOf(giamGia));
		System.out.println("Thue: " + String.valueOf(getthuenhapkhau()));
	}
}
