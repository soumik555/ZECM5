package ScannerClassNonStaticMethod;
import java.util.Scanner;

public class Prime {
	
	void prime()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
				
			}
			
		}
		if(flag==true)
		{
			System.out.println("Prime number");
			
		}
		else
		{
			System.out.println("Not a prime number");
		}
		sc.close();
				
		
	}
	
	
	
	
	public static void main(String[] args) {
		Prime p1=new Prime();
		p1.prime();
		
	}

}
