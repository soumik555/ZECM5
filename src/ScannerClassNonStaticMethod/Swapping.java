package ScannerClassNonStaticMethod;
import java.util.Scanner;

public class Swapping {
	
	void swap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		System.out.println("Values after swapping:");
		int temp=a;
		a=b;
		b=temp;
		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " +b);
		sc.close();
		
		
	}
	
	public static void main(String[] args) {
		Swapping s1=new Swapping();
		s1.swap();
		
	}

}
