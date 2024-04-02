package com.array.countvowelsandconsonants;
//i/p{"Hi","Hello","Bye","Hii","Hey"}
//fetch the count of each string if it starts with 'H' and find the factorial of that count of vowels that starts with H 
public class Newnew {
	public static void main(String[] args) {
		String arr[]= {"hi","hello","bye","hii","hey",};	int count=0;

		for(int i=0;i<arr.length;i++)

		

		{

			if(arr[i].charAt(0)=='h')

			{

				for (int j=0;j<arr[i].length();j++)

				{

					if (arr[i].charAt(j)=='a' || arr[i].charAt(j)=='e' || arr[i].charAt(j)=='i' || arr[i].charAt(j)=='o' || arr[i].charAt(j)=='u' )

					{

						count++;

					}

				}

			}
		}

			

			int fact=1;

			for(int i=count;i>=1;i--) {

				fact=fact*i;

			}

			

			System.out.println("The factorial is:"+fact);

					

			

		

	}




	}


