package ScannerClassMethod;
import java.util.Scanner;

public class Sumofodd {
	static void sumofodd()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your even number:");
		int no=sc.nextInt();
		int sum=0;
		for(int i=1;i<=no;i++)
		{
			if(i%2==1)
			{
				sum=sum+i;
				
			}
			
		}
		System.out.println("Sum of odd number is:" + sum);
		sc.close();
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		sumofodd();
	}

}
