package ExceptionalHandling;

public class Finally2 {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		try
		{
			int i=1/0;
			System.out.println(i);
			
		}
	
		
		finally
		{
			System.out.println("Close the server otherwise hacker will hack the server");
			
		}
		System.out.println("Main Ends");
	}

}
