package ScannerClassMethod;
import java.util.Scanner;
public class Reversestring {
	static void reversestring()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String value:");
		String s=sc.nextLine();
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
			
		}
		System.out.println("The reverse of String is " + s2);
		sc.close();
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		reversestring();
		
		
	}

}
