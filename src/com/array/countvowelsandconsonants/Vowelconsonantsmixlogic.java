package com.array.countvowelsandconsonants;

public class Vowelconsonantsmixlogic 
{
	public static void main(String[] args)
	{
		String arr[]= {"Hii","Hello","Bye","Hi"};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].charAt(0)=='H')
			{
				for(int j=0;j<arr[i].length();j++)
				{
					if(arr[i].charAt(j)=='a'||arr[i].charAt(j)=='e'||arr[i].charAt(j)=='i'||arr[i].charAt(j)=='o'||arr[i].charAt(j)=='u')
					{
						count++;
						
					}
					
					
				}
				
			}
				
			
		}
		System.out.println("Elements are counted for " + count + " times");
		
		int fib1=0;
		int fib2=1;
		System.out.print(fib1 +  " " + fib2);
		for(int i=0;i<=count;i++)
		{
			int fib3=fib1+fib2;
			System.out.print(" " + fib3);
			fib1=fib2;
			fib2=fib3;
			
		}
		
	}
	
	

}
