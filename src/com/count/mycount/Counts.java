package com.count.mycount;

public class Counts {
	public static void main(String[] args) {
		int no=2343439;
		int count=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem==3)
			{
				count++;
				
			}
			no=no/10;
			
		}
		System.out.println(count);
	}

}
