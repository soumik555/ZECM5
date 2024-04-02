package ScannerClass;
import java.util.Scanner;

public class Sumofeven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter your even no:");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				
			}
			
		}
		System.out.println("Sum of the given number is :" + sum);
		sc.close();
	}
}
	


