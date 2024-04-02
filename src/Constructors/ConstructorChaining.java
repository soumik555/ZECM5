package Constructors;

public class ConstructorChaining {
	ConstructorChaining(int x)
	{
		System.out.println("Hello");
		
	}
	
	ConstructorChaining(String y)
	{
		this(20);
		System.out.println("Hii");
		
	}
	
	ConstructorChaining(int x,String y)
	{
		this("ok");
		System.out.println("Woww");
		
	}
	ConstructorChaining(String y,int x)
	{
		this(20,"ok");
		System.out.println("ok");
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		new ConstructorChaining("ok",20);
		
	}

}
