package ScannerClass;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Fibonacci number " );
		int fib1=sc.nextInt();
		System.out.println("Enter 2nd Fibonacci number " );
		int fib2=sc.nextInt();
		System.out.print(fib1  + " " + fib2);
		for(int i=1;i<=5;i++)
		{
			int fib3=fib1+fib2;
			System.out.print(" " + fib3);
			fib1=fib2;
			fib2=fib3;
			sc.close();
			
		}
	}
	
}
