package ScannerClassMethod;
import java.util.Scanner;
public class Numbercounting {
	static void countno()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		int count=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem==5)
			{
				count++;
				
			}
			no=no/10;
			
		}
		System.out.println("The given element is count for " + count + " times");
		sc.close();
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		countno();
	}

}
