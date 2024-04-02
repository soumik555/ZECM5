package com.array.countvowelsandconsonants;

public class Sumofduplicates {
	public static void main(String[] args) {
		int arr[]= {5,1,3,2,5,6,6,7,7};
		int sum=0;
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
				
				sum=sum+arr[i];
				
			}
			
			
		}
		System.out.println("Sum of duplicates are " + sum);
	}

}
