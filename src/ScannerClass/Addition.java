package ScannerClass;
import java.util.Scanner;
public class Addition {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of 1st number");
	int x=sc.nextInt();
	System.out.println("Enter the value of 2nd number");
	int y=sc.nextInt();
	int z=x+y;
	System.out.println("The Addition of two number is " + z);
	sc.close();
}
}
