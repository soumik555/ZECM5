package ExceptionalHandling;

public class array {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		try
		{
			int arr[]= {10,20,30,40};
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Handling");
			
		}
		System.out.println("Main Ends");
	}

}
