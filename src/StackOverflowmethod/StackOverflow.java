package StackOverflowmethod;

public class StackOverflow {
	
	
	static void add()
	{
		add();
	}
	static void sub()
	{
		sub();
	}
	public static void main(String[] args) {
		add();
		sub();
		
	}

}
