package Lab5Bai2;

public class SinhVienIT {

	protected double diemJava;
	protected double diemCss;
	protected double diemHtml;
	
	public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
		
		this.diemJava = diemJava;
		this.diemCss = diemCss;
		this.diemHtml = diemHtml;
	}
	
	double getDiem() {
		return (2*diemJava+diemCss+diemCss)/4;
	}
}
