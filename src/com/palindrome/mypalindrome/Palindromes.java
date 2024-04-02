package com.palindrome.mypalindrome;

public class Palindromes {
	public static void main(String[] args) {
		int no=121;
		int copy=no;
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			
		}
		if(rev==copy)
		{
			System.out.println("Palindrome nuber");
			
		}
		else
		{
			System.out.println("Not a palindrome number");
		}
	}

}
