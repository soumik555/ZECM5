package ScannerClass;
import java.util.Scanner;

public class Palindromecheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entere your number:");
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
			System.out.println("Its a Palindrome number:");
			
		}
		else
		{
			System.out.println("Its not a Palindrome number:");
		}
		sc.close();
		
	}

}
