package ScannerClassMethod;
import java.util.Scanner;

public class Armstrong {
	
	static void armstrong()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int no=sc.nextInt();
		int sum=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem*rem*rem;
			no=no/10;
			
		}
		if(copy==sum)
		{
			System.out.println("Armstrong number:");
			
		}
		else
		{
			System.out.println("Not an Armstrong number");
		}
		sc.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		armstrong();
	}

}
