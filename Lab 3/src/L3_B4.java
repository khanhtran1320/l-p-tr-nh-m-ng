import java.util.Arrays;
import java.util.Scanner;

public class L3_B4 {
	public static void sapxep(String sv[], float DiemSV[]) {
		for(int i=0;i<sv.length-1;i++)
		{
			for(int j=i+1;j<sv.length;j++) {
				if(DiemSV[i]>DiemSV[j]) {
					float tam=DiemSV[i];
					DiemSV[i]=DiemSV[j];
					DiemSV[j]=tam;
					String svTam= sv[i];
					sv[i]=sv[j];
					sv[j]=svTam;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String sv[] = new String[3];
		float DiemSV[] = new float[3];
		
		Scanner nhap=new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang: ");
		n = nhap.nextInt();
		for(int i=0;i<3;i++)
		{
			System.out.printf("Nhap ten cho sinh vien thu"+ i);
			sv[i]=nhap.nextLine();
			System.out.printf("Nhap diem cho sinh vien thu"+ i);
			DiemSV[i]=nhap.nextFloat();
		}
		System.out.println("Ten sinh vien: "+Arrays.toString(sv));
		System.out.println("Diem sinh vien: "+Arrays.toString(DiemSV));
		
		sapxep(sv,DiemSV);
		
		for(int i=0;i<3;i++) {
			System.out.println("Ho ten: "+sv[i]);
			System.out.println("Diem sinh vien"+DiemSV[i]);
			if(DiemSV[i]>=9) {
				System.out.println("Xuat Sac");
			}else if(DiemSV[i]>=7.5) {
				System.out.println("Gioi");
			}else if(DiemSV[i]>=6.5) {
				System.out.println("Kha");
			}else if(DiemSV[i]>=5) {
				System.out.println("Trung binh");
			} else {
				System.out.println("Yeu");
			}
			System.out.println();
		}
}
}