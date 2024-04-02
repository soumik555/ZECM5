package ScannerClassMethod;
import java.util.Scanner;

public class Fibonacci {
	
	
	
	
	
	static void fibonacci()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of 1st Fibonacci number:");
		int fib1=sc.nextInt();
		System.out.println("Enter the value of 2nd Fibonacci number:");
		int fib2=sc.nextInt();
		System.out.print(fib1 + " " + fib2);
		for(int i=1;i<=5;i++)
		{
			int fib3=fib1+fib2;
			System.out.print(" " + fib3);
			fib1=fib2;
			fib2=fib3;
			
		}
		sc.close();
		
	}
	
	
	
	
	public static void main(String[] args) {
		fibonacci();
	}

}
