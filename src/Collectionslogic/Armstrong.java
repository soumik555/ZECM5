package Collectionslogic;

import java.util.ArrayList;
import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList a1=new ArrayList();
		System.out.println("Enter your number:");
		int no=sc.nextInt();
		
		
		int sum=0;
		int copy=no;
		
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem*rem*rem;
			no=no/10;
			
		}
		if(copy==sum)
		{
			a1.add("Armstrong number");
			
		}
		else
		{
			a1.add("Not Armstrong number");
		}
		System.out.println(a1);
		
	}

}
