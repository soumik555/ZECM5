package ScannerClassMethod;
import java.util.Scanner;
public class Prime {
	static void prime()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int no=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
				
			}
			
		}
		if(flag==true)
		{
			System.out.println("Its a prime numebr:");
			
		}
		else
		{
			System.out.println("Not a prime number:");
		}
		sc.close();
	}
	
	
	public static void main(String[] args) {
		prime();
		
	}

}
