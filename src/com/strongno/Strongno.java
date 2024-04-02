package com.strongno;

public class Strongno {
	public static void main(String[] args) {
		int no=145;
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+fact(rem);
			no=no/10;
			
		}
		if(copy==sum)
		{
			System.out.println("Strong number");
		
		}
		else
		{
			System.out.println("Not Strong number");
		}
		
	}
	static int fact(int n)
	{
		int fact=1;
		for(int i=n;i>1;i--)
		{
			fact=fact*i;
			
		}
		return fact;
		
	}

}
