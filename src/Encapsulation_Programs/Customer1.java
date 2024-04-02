package Encapsulation_Programs;

import java.util.Scanner;

class Bank
{
	Scanner sc=new Scanner(System.in);
	private int pin=1234;//default pin
	public int getpin()
	{
		return pin;
	}
	public void setpin(int pin)
	{
		this.pin=pin;//1234=5678
		
	}
	
}








public class Customer1 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Bank b1=new Bank();
		System.out.println("The default pin by Bank is " + b1.getpin());
		System.out.println("Enter your pin:");
		int pin=sc.nextInt();
		b1.setpin(pin);
		System.out.println("The new pin entered by the Customer is " + b1.getpin());
	}

}
