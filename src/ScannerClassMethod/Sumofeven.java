package ScannerClassMethod;
import java.util.Scanner;
public class Sumofeven {
	
	
	static void sumofeven()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the even number:");
		int no=sc.nextInt();
		int sum=0;
		for(int i=1;i<=no;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				
			}
			
		}
		System.out.println("Sum of even number is :" + sum);
		sc.close();
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		sumofeven();
		
	}

}
