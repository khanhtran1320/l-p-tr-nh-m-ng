import java.util.Arrays;
import java.util.Scanner;
public class L3_B3 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		int n;
		System.out.print("Nhap phan tu mang: ");
		n = nhap.nextInt();
		int mang[] = new int [n];
		
		for(int i=0;i<n;i++)
		{
			System.out.printf("Nhap gia tri cho phan tu: "+i);
			mang[i] = nhap.nextInt();
		}
		Arrays.sort(mang);
		System.out.println("Mang da sap xep: "+Arrays.toString(mang));
		
		int min=mang[0];
		for(int i=0;i<n;i++)
		{
			if(min>mang[i]) 
			{
				min=mang[i];
			}
		}
		System.out.println("Phan tu nho nhat la: "+min);
		
		float count=0;
		int tong=0;
		for(int i=0;i<n;i++)
		{
			if(mang[i]%3==0) 
			{
				tong +=mang[i];
				count++;
			}
		}
		float trungbinh = (float) tong/count;
		System.out.println("Trung binh cac so chia het cho 3: "+trungbinh);
	}

}