package ScannerClassNonStaticMethod;
import java.util.Scanner;

public class Sumofeven {
	
	
	void soe()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		int sum=0;
		for(int i=1;i<=no;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				
			}
			
		}
		System.out.println(sum);
		sc.close();
		
	}
	
	public static void main(String[] args) {
		Sumofeven s1=new Sumofeven();
		s1.soe();
		
		
	}

}
