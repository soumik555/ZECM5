package Constructors;//can we overload the main method?

public class Sample {
	public static void main(String x,int y)
	{
		System.out.println("Main Method overloaded " + x + y);
		
	}
	public static void main(String[] args) 
	{
		main("Hello " , 5665);
		
	}

}
