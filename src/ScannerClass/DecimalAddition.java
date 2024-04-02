package ScannerClass;
import java.util.Scanner;

public class DecimalAddition {
	public static void main(String[] args) {
		Scanner refvar=new Scanner(System.in);
		System.out.println("Enter two numbers: " );
		double a=refvar.nextDouble();
		double b=refvar.nextDouble();
		double c=a+b;
		System.out.println("Addition of two numbers is " + c);
		refvar.close();
		
	}

}
