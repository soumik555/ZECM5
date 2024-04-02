package ScannerClassNonStaticMethod;
import java.util.Scanner;

public class Addition {
	
	void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Addition of a and b is: " + c);
		
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Addition a1=new Addition();
		a1.add();
		
	}
	

}
