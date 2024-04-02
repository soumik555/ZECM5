package ScannerClassNonStaticMethod;
import java.util.Scanner;

public class Fibonacci {
	
	void fibonacci()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Fibonacci number:");
		int fib1=sc.nextInt();
		System.out.println("Enter the 2nd Fibonacci number:");
		int fib2=sc.nextInt();
		System.out.print(fib1+ " " + fib2);
		for(int i=1;i<=5;i++)
		{
			int fib3=fib1+fib2;
			System.out.print(" " + fib3);
			fib1=fib2;
			fib2=fib3;
			sc.close();
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Fibonacci f1=new Fibonacci();
		f1.fibonacci();
		
		
	}

}
