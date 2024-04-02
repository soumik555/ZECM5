package com.prime.rangedprime;

public class Rangedprime {
	public static void main(String[] args) {
		int i;
		int j;
		for( i=15;i<=20;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					break;
					
				}
				
			}
			if(i==j)
			{
				System.out.println(i);
				
			}
			
		}
	}

}
