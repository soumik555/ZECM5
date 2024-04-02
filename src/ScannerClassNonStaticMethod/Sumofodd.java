package ScannerClassNonStaticMethod;
import java.util.Scanner;

public class Sumofodd {
	
	void sodd()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		int sum=0;
		for(int i=5;i<=no;i++)
		{
			if(i%2==1)
			{	
			
			sum=sum+i;
			}
			
		}
		System.out.println(sum);
		sc.close();
		
	}
	public static void main(String[] args) {
		Sumofodd odd1=new Sumofodd();
		odd1.sodd();
		
	}

}
