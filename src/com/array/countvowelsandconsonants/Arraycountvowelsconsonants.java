package com.array.countvowelsandconsonants;

public class Arraycountvowelsconsonants {
	public static void main(String[] args) {
		String arr[]= {"hi","hello","Bye"};
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++)
		{
			String s1=arr[i];
			for(int j=0;j<s1.length();j++)
			{
				if(s1.charAt(j)=='a'||s1.charAt(j)=='e'||s1.charAt(j)=='i'||s1.charAt(j)=='o'||s1.charAt(j)=='u')
				{
					System.out.println("Vowels are " + s1.charAt(j));
					count1++;
					
					
				}
				if(s1.charAt(j)!='a'&& s1.charAt(j)!='e'&& s1.charAt(j)!='i'&& s1.charAt(j)!='o'&& s1.charAt(j)!='u')
				{
					System.out.println("Consonants are " + s1.charAt(j));
					count2++;
					
					
				}
				
				
			}
			
			
			
		}
		System.out.println("`Total no of Vowels are " + count1);
		System.out.println("`Total no of Consonants are " + count2);
		
	}

}
