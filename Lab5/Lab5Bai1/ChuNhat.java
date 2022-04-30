package Lab5Bai1;

public class ChuNhat {
	protected double dai;
	protected double rong;
	
	public ChuNhat(double dai,double rong) {
		this.dai=dai;
		this.rong=rong;
	}

	public double getChuVi() {
		return (dai+rong)*2;
	}
	public double getDienTich() {
		return dai*rong;
	}
	 public void xuat() {
		 System.out.printf("Dien tich HCN: "+getDienTich());
		 System.out.printf("Chu vi HCN: "+getChuVi());
	 }
}
