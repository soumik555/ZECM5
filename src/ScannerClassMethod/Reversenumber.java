package ScannerClassMethod;
import java.util.Scanner;


public class Reversenumber {
	
	static void reverse()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int no=sc.nextInt();
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			
		}
		System.out.println("Reverse of the given number is " + rev);
		sc.close();
	}
	
	public static void main(String[] args) {
		reverse();
	}

}