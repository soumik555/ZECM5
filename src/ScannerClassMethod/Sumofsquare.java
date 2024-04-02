package ScannerClassMethod;
import java.util.Scanner;

public class Sumofsquare {
	static void sos()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int no=sc.nextInt();
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem*rem;
			no=no/10;
			
		}
		System.out.println("The sum of square of the number is: " + sum);
		sc.close();
		
	}
	
	public static void main(String[] args) {
		sos();
	}

}
