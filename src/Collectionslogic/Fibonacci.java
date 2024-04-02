package Collectionslogic;


import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
	
	ArrayList a1=new ArrayList();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st Fibonacci number:");
	int fib1=sc.nextInt();
	System.out.println("Enter 2nd Fibonacci number:");
	int fib2=sc.nextInt();
	
	System.out.print(fib1 + " " + fib2);
	for(int i=1;i<=5;i++)
	{
		int fib3=fib1+fib2;
		a1.add("  "+  fib3);
		
	
		fib1=fib2;
		fib2=fib3;
		
		
	}
	System.out.println(a1);
	
	
			
			
	
	
	

}
	
    }
