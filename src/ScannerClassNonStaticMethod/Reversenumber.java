package ScannerClassNonStaticMethod;
import java.util.Scanner;

public class Reversenumber {
	
	
	
	void reverse()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			
		}
		System.out.println("Reverse of the number is " + rev);
		sc.close();
		
	}
	public static void main(String[] args) {
		Reversenumber r1=new Reversenumber();
		r1.reverse();
		
	}

}
