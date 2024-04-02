package ScannerClass;
import java.util.Scanner;
public class Charactercount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='l'|| s.charAt(i)=='L')
			{
				count++;
				
			}
			
		}
		System.out.println("Repeated element is:" + count);
		sc.close();
		
	}

}
