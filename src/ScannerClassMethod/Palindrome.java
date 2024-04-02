package ScannerClassMethod;
import java.util.Scanner;
public class Palindrome {
	
	
	static void palindromecheck()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your nyumber");
		int no=sc.nextInt();
		int rev=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			
		}
		if(copy==rev)
		{
			System.out.println("Palindrome number:");
			
		}
		else
		{
			System.out.println("Not a Palindrome number");
		}
		sc.close();
	}
	
	
	public static void main(String[] args) {
		palindromecheck();
	}

}
