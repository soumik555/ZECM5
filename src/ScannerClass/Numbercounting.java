package ScannerClass;
import java.util.Scanner;


public class Numbercounting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
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
		System.out.println("The number is counted for " + count + " times");
		sc.close();
	}

}
