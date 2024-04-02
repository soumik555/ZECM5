package com.Fibonacci.myFibonacci;

public class Sumoffibonacci {
	public static void main(String[] args) {
		int fib1=0;
		int fib2=1;
		System.out.println(fib1 + " " + fib2);
		int sum=0;
		for(int i=1;i<=5;i++)
		{
			int fib3=fib1+fib2;
			System.out.println(" " + fib3);
			fib1=fib2;
			fib2=fib3;
			sum=sum+fib3;
			
			
		}
		System.out.println( " The sum of Fibonacci is: " +  sum);
		
	}

}
