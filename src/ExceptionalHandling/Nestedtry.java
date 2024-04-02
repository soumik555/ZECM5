package ExceptionalHandling;

public class Nestedtry {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		try {
			int arr[]= {10,20,30,40,50};
			try {
				int i=1/0;
				System.out.println(arr[i]);
			}
			catch(ArithmeticException a)
			{
				System.out.println("Caught");
				
				
			}
		
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Handled");
			
		}
		System.out.println("Main Ends");
	}

}
