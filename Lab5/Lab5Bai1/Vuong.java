package Lab5Bai1;

public class Vuong {
	protected double canh;
	public Vuong(double canh) {
		this.canh =canh;
	}
	public double getChuVi() {
		return 4*canh;
	}
	public double getDienTich() {
		return canh*canh;
	}
	public void xuat() {
		System.out.printf("Dien tich Vuong: "+getDienTich());
		 System.out.printf("Chu vi Vuong: "+getChuVi());
	}
}
