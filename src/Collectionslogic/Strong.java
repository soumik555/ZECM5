package Collectionslogic;

import java.util.ArrayList;
import java.util.Scanner;

public class Strong {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int no=sc.nextInt();
		int copy=no;
		int sum=0;
		
		while(no!=0)
		{
			int rem=no%10;
			int fact=1;
			for(int i=rem;i>=1;i--)
			{
				fact=fact*i;
				
			}
			sum=sum+fact;
			
			no=no/10;
			
			
		}
		if(copy==sum)
		{
			a1.add("Strong number:");
			
		}
		else
		{
			a1.add("Not a Strong number:");
		}
		System.out.println(a1);
		
	}

}
