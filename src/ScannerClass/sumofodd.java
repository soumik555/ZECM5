package ScannerClass;
import java.util.Scanner;

public class sumofodd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the odd number:");
		int number=sc.nextInt();
		int sum=0;
		for(int i=1;i<=number;i++)
		{
			if(i%2==1)
			{
				sum=sum+i;
				
				
			}
			
		}
		System.out.println("Sum of the given number is: " + sum);
		sc.close();
		
	}

}
