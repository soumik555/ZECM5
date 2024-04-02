package ScannerClassNonStaticMethod;
import java.util.Scanner;

public class Strong {
	void strong()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int no=sc.nextInt();
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+fact(rem);
			no=no/10;
			
		}
		if(copy==sum)
		{
			System.out.println("Strong number:");
			
		}
		else
		{
			System.out.println("Not a Strong number:");
		}
		sc.close();
		
	
		}
	static int fact(int n)
	{
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
			
			
		}
		return fact;
		
	}
	
	
	
		
	
	
	
	
	
	public static void main(String[] args) 
	{
		Strong s1=new Strong();
		s1.strong();
		
	}

}
