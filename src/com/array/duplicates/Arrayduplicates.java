package com.array.duplicates;

public class Arrayduplicates {
	public static void main(String[] args) {
		int arr[]= {15,78,15,77,15};
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
				System.out.println(arr[i] + " is repeated for " + count +  "  times");
				
			}
			
		}
	}

}
