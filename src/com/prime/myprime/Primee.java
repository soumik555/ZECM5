package com.prime.myprime;

public class Primee {
	public static void main(String[] args) {
		int no=27;
		boolean flag=true;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
				
			}
			
		}
		if(flag==true)
		{
			System.out.println("Prime number");
			
		}
		else
		{
			System.out.println("Not a prime number");
		}
		
	}

}
