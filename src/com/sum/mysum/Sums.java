package com.sum.mysum;

public class Sums 
{
	public static void main(String[] args) {
		
	
	int no=238;
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		//sum=sum+rem;
		sum=sum+rem*rem;
		//sum=sum+rem*rem*rem;
		no=no/10;
		
	}
	System.out.println(sum);
	
	
}
}
	
