package ScannerClass;
import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your  number:");
		int number=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				flag=false;
				break;
				
			}
			
		}
		if(flag==true)
		{
			System.out.println("Its a prime number:");
			
		}
		else
		{
			System.out.println("Its not a prime number:");
		}
		sc.close();
		
	}

}
