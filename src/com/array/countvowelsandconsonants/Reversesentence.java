package com.array.countvowelsandconsonants;

public class Reversesentence {
	

	public static void main(String[] args) {
		String arr[]= {"hello my name is Soumik okk"};
		
		for(int i=0;i<arr.length;i++)
		{
			
			String s1=arr[i];
			String s2="";
			
			for(int j=s1.length()-1;j>=0;j--)
			{
				s2=s2+s1.charAt(j);
				
			}
			System.out.println(s2);
			
		}
		
	}

}
