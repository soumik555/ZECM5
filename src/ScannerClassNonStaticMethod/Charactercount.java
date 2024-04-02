package ScannerClassNonStaticMethod;
import java.util.Scanner;

public class Charactercount {
	
	void chcount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string:");
		String s1=sc.nextLine();
		System.out.println("Enter the letter to be counted:");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s1.length()-1;i++)
		{
			for(int j=0;j<s.length()-1;j++)
			{
				if(s1.charAt(i)==s.charAt(j))
				{
					count++;
					
				}
				
				
				
			}
			if(count>1)
			{
				System.out.println(s1.charAt(i)+  " is counted for " + count + " times" );
				
			}
			
			
			
			
			
		}
		
		
		
		sc.close();
	}
	
	
	public static void main(String[] args) {
		Charactercount c1=new Charactercount();
		c1.chcount();
		
	}

}
