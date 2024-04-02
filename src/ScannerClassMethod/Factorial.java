package ScannerClassMethod;
import java.util.Scanner;

public class Factorial {
	
	static void factorial()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int no=sc.nextInt();
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of the given number is :" + fact);
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		factorial();
		
	}

}
