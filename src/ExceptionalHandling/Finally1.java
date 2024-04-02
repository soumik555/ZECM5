package ExceptionalHandling;

public class Finally1 {
	public static void main(String[] args)
	{
		System.out.println("Main Strats");
		try
		{
			int i=1/0;
			System.out.println(i);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
			
		}
		finally
		{
			System.out.println("Close the Server");
		}
		System.out.println("Main Ends");
		
	}

}
