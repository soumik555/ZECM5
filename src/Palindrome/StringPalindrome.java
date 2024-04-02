package Palindrome;
import java.util.Scanner;

public class StringPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String:");
		String s=sc.nextLine();
		
		String s2="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
			
		}
		
		if(s2.equals(s))
		{
			System.out.println("String is a Palindrome:");
			
		}
		else
		{
			System.out.println("Not a palindrome:");
		}
		sc.close();
		
		
		
	}
}



