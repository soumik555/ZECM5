package ExceptionalHandling;

public class String1 {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		try
		{
		String s="Hello";
		System.out.println(s.charAt(5));
		}
		catch(StringIndexOutOfBoundsException ss)
		{
			System.out.println("Handling");
			
		}
		System.out.println("Main Ends");
		
		
	}

}
