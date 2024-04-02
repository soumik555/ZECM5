package ScannerClass;
import java.util.Scanner;

public class Reversestring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your given String:");
		String s=sc.nextLine();
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
			
		}
		System.out.println("Reverse of String is: " + s2);
		sc.close();
	}

}
