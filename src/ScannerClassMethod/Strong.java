package ScannerClassMethod;
import java.util.Scanner;

public class Strong {
	static void strong()
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your number:");
	  int no=sc.nextInt();
	  int sum=0;
	  int copy=no;
	  while(no!=0)
	  {
		  int rem=no%10;
		  sum=sum+fact(rem);
		  no=no/10;
		  
		  
	  }
	  if(copy==sum)
	  {
		  System.out.println("Its a Strong number:");
		  
	  }
	  else
	  {
		  System.out.println("Not a strong number:");
	  }
	  sc.close();
	 
	}
	
	static int fact(int n)
	{
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact *i;
			
		}
		return fact;
		
	}
	
	
	
	
	public static void main(String[] args) {
		strong();
		

}
  }