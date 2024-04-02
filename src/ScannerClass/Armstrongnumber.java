package ScannerClass;
import java.util.Scanner;

public class Armstrongnumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your given number:");
		int number=sc.nextInt();
		int sum=0;
		int copy=number;
		while(number!=0)
		{
			int rem=number%10;
			sum=sum+rem*rem*rem;
			number=number/10;
			
			
		}
		if(copy==sum)
		{
			System.out.println("Its an Armstrong number:");
			
		}
		else
		{
			System.out.println("Its not an Armstrong number");
		}
		sc.close();
		
	}

}
