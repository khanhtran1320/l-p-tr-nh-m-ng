package Lab5Bai2;

public class SinhVienPoly {
	public String hoTen;
	public String nganh;
	
	public SinhVienPoly(String hoTen, String nganh) {
		this.hoTen = hoTen;
		this.nganh = nganh;
	}

	public String getHoTen() {
		return hoTen;
	}

	//public void setHoTen(String hoTen) {
		//this.hoTen = hoTen;
	//}

	public String getNganh() {
		return nganh;
	}

	//public void setNganh(String nganh) {
		//this.nganh = nganh;
	//}
	abstract double getDiem();
	
	public String getHocLuc() {
		String hocLuc = null;
		double diem=getDiem();
		if(diem>=9) {
			hocLuc="Xuat sac";
		}else if(diem>=7.5) {
			hocLuc="Gioi";
		}else if(diem>=6.5) {
			hocLuc="Kha";
		}else if(diem>=5) {
			hocLuc="Trung binh";
		}else {
			hocLuc="Yeu";
		}
		return hocLuc;
	}
}
