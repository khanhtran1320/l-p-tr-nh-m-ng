package Lab5Bai2;

public class SinhVienBiz {
	protected double diemMarketting;
	protected double diemSales;
	
	public SinhVienBiz(String hoTen, String nganh, double diemMarketting, double diemSales) {
		super(hoTen, nganh);
		this.diemMarketting = diemMarketting;
		this.diemSales = diemSales;
	}


	double getDiem() {
		return (2*diemMarketting+diemSales)/3;
	}
}
