package Rangeevenodd;

import java.util.Arrays;

public class Rangeevenodd2 {
	public static void main(String[] args) {
		
		int sumofeven=0;
		int sumofodd=0;
		
		for(int i=20;i<=30;i++)
		{
			if(i%2==0)
			{
				sumofeven=sumofeven+i;
				
			}
			else if(i%2==1)
			{
				sumofodd=sumofodd+i;
				
			}
			
				
			
			
			
		}
		System.out.println("Sum of even number is " + sumofeven);
		System.out.println("Sum of odd number is " + sumofodd);
		String s1= String.valueOf(sumofeven);
		char arr[]=s1.toCharArray();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
	}

}
