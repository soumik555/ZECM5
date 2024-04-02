package com.array.myarray1;

public class Array1 {
	public static void main(String[] args) {
		int arr[]= {15,27,99,07,8,2};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
				
			}
			
			
		}
		System.out.println(sum);
	}

}
