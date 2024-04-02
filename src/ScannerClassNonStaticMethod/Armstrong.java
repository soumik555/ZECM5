package ScannerClassNonStaticMethod;
import java.util.Scanner;

public class Armstrong {
	void arm()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		int copy=no;
		int sum=0;
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
			System.out.println("Not an Armstrong number:");
		}
		sc.close();
		
	}
	
	
	
	
public static void main(String[] args) {
	Armstrong a1=new Armstrong();
	a1.arm();
	
	
}

}
