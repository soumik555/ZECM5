package ScannerClass;
import java.util.Scanner;
public class Subtraction {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of 2 numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int c=x+y;
		System.out.println("Addition of the tweo numbers is " + c);
		sc.close();
	}

}
