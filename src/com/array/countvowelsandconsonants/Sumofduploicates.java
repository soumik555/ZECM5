package com.array.countvowelsandconsonants;

public class Sumofduploicates {
	public static void main(String[] args) {
		int arr[]= {1,5,6,5,7,8,8};
		int sum=0;
		int acc[]=new int [arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					
				}
				
			}
			if(count>1)
			{
				acc[i]=arr[i];
				
				
			}
			for(int k=0;k<acc.length;k++)
			{
				if(acc[k]!=arr[i])
				{
					sum=acc[k]+arr[i];
					
				}
				
			}
				
				
			
		}
		System.out.println(sum);
	}

}
