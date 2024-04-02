package ScannerClassNonStaticMethod;
import java.util.Scanner;

public class Numbercounting {
	
	
	
	void counts()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		System.out.println("Enter the number to be counted:");
		int k1=sc.nextInt();
		int count=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem==k1)
			{
				count++;
				
			}
			no=no/10;
			
		}
		System.out.println(count);
		sc.close();
		
	}
	
	public static void main(String[] args) {
		Numbercounting n1=new Numbercounting();
	    n1.counts();
		
	}

}
