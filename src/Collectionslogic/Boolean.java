package Collectionslogic;

import java.util.ArrayList;
import java.util.Scanner;

public class Boolean {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		
		boolean flag=true;
		
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
				
			}
			
		}
		if(flag==true)
		{
			a1.add("Prime number:");
			
		}
		else
		{
			a1.add("Not a prime number:");
		}
		System.out.println(a1);
		
	}

}
