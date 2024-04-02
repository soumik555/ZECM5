package ScannerClass;
import java.util.Scanner;

public class Swappingoftwonumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		int temp=0;
		System.out.println("Numbers after swapping are:");
		temp=a;
		a=b;
		b=temp;
		System.out.println("Value of a after swapping is:" + a);
		System.out.println("Value of b after swapping is:" + b);
		sc.close();
		
	}

}
