package ScannerClass;
import java.util.Scanner;

public class Sumofsquare {
	public static void main(String[] args) {
		
	
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
	System.out.println("Sum of square is : " + sum);
	sc.close();
	

} 
     }
