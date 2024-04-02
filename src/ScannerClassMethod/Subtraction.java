package ScannerClassMethod;
import java.util.Scanner;

public class Subtraction {
	static void sub()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of 1st number:");
		int a=sc.nextInt();
		System.out.println("Enter the value of 2nd number:");
		int b=sc.nextInt();
		int c=a-b;
		System.out.println("Subtraction of two number is " + c);
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		sub();
		
	}

}
