package Lab5Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSV {

	ArrayList<SinhVienPoly> list = new ArrayList<>();
	
	public void nhap() {
		do {
			Scanner nhap = new Scanner(System.in);
			System.out.print("Nhap ho&ten SV:");
			String hoTen =nhap.nextLine();
			if(hoTen==null||hoTen.equals("")) {
				break;
			}
			System.out.print("Nhap ten nganh (IT/Biz): ");
			String nganh = nhap.nextLine();
			if(nganh.equalsIgnoreCase("IT")) {
				System.out.print("Diem Java: ");
				double diemJava = nhap.nextDouble();
				
				System.out.print("Diem Css: ");
				double diemCss = nhap.nextDouble();
				
				System.out.print("Diem Html: ");
				double diemHtml = nhap.nextDouble();
				
				SinhVienPoly newSV = new SinhVienIT(hoTen, nganh, diemJava, diemCss, diemHtml);
				list.add(newSV);
			}else if(nganh.equalsIgnoreCase("Biz")) {
				
				System.out.print("Nhap diem Marketting: ");
				double diemMarketting = nhap.nextDouble();
				
				System.out.print("Nhap diem Sales: ");
				double diemSales = nhap.nextDouble();
				
				SinhVienPoly newSV = new SinhVienBiz(hoTen, nganh, diemMarketting, diemSales);
				list.add(newSV);
			}
		}while(true);
	}
	
	public void xuat() {
		for(SinhVienPoly sv : list) {
			System.out.println("Ho ten: "+sv.getHoTen());
			System.out.println("Nganh: "+sv.getNganh());
			System.out.println("Diem: "+sv.getDiem());
			System.out.println("Hoc luc: "+sv.getHocLuc()+"\n");
		}
	}
	public void xuatGioi() {
		for(SinhVienPoly sv:list) {
			if(sv.getHocLuc().equalsIgnoreCase("Gioi")) {
				System.out.println("Ho ten: "+sv.getHoTen());
				System.out.println("Nganh: "+sv.getNganh());
				System.out.println("Diem: "+sv.getDiem());
				System.out.println("Hoc luc: "+sv.getHocLuc()+"\n");
			}
		}
	}
	
	Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>() {
		@Override
		public int compare(SinhVienPoly o1,SinhVienPoly o2) {
			return Double.compare(o1.getDiem(),o2.getDiem());
		}
	};
	
	public void sxTheoDiem() {
		Collections.sort(list,comp);
		System.out.println("Sap xep theo diem tang dan");
		xuat();
		
	}
	public void Menu() {
		Scanner s = new Scanner(System.in);
		int chon=0;
		
		do {
			System.out.println("\n Menu chon");
			System.out.println("1. Nhap DS SV");
			System.out.println("2. Xuat TT SV");
			System.out.println("3. Xuat DS SV co hoc luc gioi");
			System.out.println("4. Sap xep danh sach sinh vien theo diem");
			System.out.println("0. Thoat");
			System.out.print("Chon chuc nang: ");
			chon = s.nextInt();
			if(chon!=0)
			{
				switch (chon) {
				case 0: break;
				case 1: nhap(); break;
				case 2: xuat(); break;
				case 3: xuatGioi(); break;
				case 4: sxTheoDiem(); break;
				default:
				System.out.println("Nhap sai, nhap lai");
				}
			}
		}while (chon!=0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}