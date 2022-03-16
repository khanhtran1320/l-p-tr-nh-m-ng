
public class Hanghoa {
	private String tenHH;
	private double donGia;
	private double giamGia;
	
	public Hanghoa() {}
	
	public Hanghoa(String tenHH, double donGia, double giamGia) {
		this.tenHH=tenHH;
		this.donGia=donGia;
		this.giamGia=giamGia;
	}
	public Hanghoa(String tenHH, double donGia) {
		this.tenHH=tenHH;
		this.donGia=donGia;
		this.giamGia=0;
	}
	//xay dung setter
	void setTenHH(String tenHH) {
		this.tenHH=tenHH;
	}
	void setdonGia(double donGia) {
		this.donGia=donGia;
	}
	void setgiamGia(double giamGia) {
		this.giamGia=giamGia;
	}
	
	// xay dung getter
	String gettenHH() { return this.tenHH;}
	double getdonGia() { return this.donGia;}
	double getgiamGia() { return this.giamGia;}
	
	
}
