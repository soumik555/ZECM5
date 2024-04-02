package ScannerClassNonStaticMethod;
import java.util.Scanner;

public class Sumofsquare {
	
	void sos()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem*rem;
			no=no/10;
			
		}
		System.out.println(sum);
		sc.close();
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Sumofsquare s1=new Sumofsquare();
		s1.sos();
		
	}

}
