package ScannerClass;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int no=sc.nextInt();
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
			
		}
		System.out.println("The factorial of the number is " + fact);
		sc.close();
	}
	

}
