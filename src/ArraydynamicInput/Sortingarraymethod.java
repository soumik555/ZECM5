package ArraydynamicInput;
import java.util.Scanner;
import java.util.Arrays;
public class Sortingarraymethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the " + i + " element");
			arr[i]=sc.nextInt();
			
		}
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)//ascending order logic
		{
			System.out.println(arr[i]+ " ");
			
			
		}
		sc.close();
		
	}

}
