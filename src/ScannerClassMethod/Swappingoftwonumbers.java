package ScannerClassMethod;
import java.util.Scanner;

public class Swappingoftwonumbers {
	static void swap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of 1st number:");
		int a=sc.nextInt();
		System.out.println("Enter the value of 2nd number:");
		int b=sc.nextInt();
		int temp=0;
		System.out.println("Numbers after Swapping:");
		temp=a;
		a=b;
		b=temp;
		
		
		System.out.println("Value of 1st number after Swapping:" + a);
		System.out.println("Value of 2nd number after Swapping:" + b);
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		swap();
	}

}
