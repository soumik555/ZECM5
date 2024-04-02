package com.array.vowelsconsonants;

public class Vowelsconsonants {
	public static void main(String[] args) {
		String arr[]= {"hello","hi","bye","ok"};
		for(int i=0;i<arr.length;i++)
		{
			String s1=arr[i];
			for(int j=0;j<s1.length();j++)
			{
				if(s1.charAt(j)=='a'||s1.charAt(j)=='e'||s1.charAt(j)=='i'||s1.charAt(j)=='o'||s1.charAt(j)=='u')
				{
					System.out.println("The vowels in the given string are " + s1.charAt(j));
					
				}
				
				if(s1.charAt(j)!='a'&&s1.charAt(j)!='e'&& s1.charAt(j)!='i'&& s1.charAt(j)!='o'&& s1.charAt(j)!='u')
				{
					System.out.println("The consonants in the given string are " + s1.charAt(j));
					
				}
				
				
			}
			
		}
	}

}
