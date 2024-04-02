package ScannerClassMethod;
import java.util.Scanner;
public class Charactercount {
	static void counts()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String:");
		String s=sc.nextLine();
		int count=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)=='l'|| s.charAt(i)=='L')
			{
				count++;
				
			}
			
		}
		System.out.println("The given element is counted for " + count + " times");
		sc.close();
	}
	
	
	
	
	
	public static void main(String[] args) {
		counts();
	}

}
