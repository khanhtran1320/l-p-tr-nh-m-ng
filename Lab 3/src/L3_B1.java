import java.util.Scanner;

public class L3_B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n = nhap.nextInt();
		Boolean ok = true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				ok=false;
				break;
			}
		}	
		if(ok==true)
		{
			System.out.println(n +" la So nguyen to");
		}
		else
		{
			System.out.println(n +" khong phai la So nguyen to");
		}
	}
}