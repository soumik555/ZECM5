package ArraydynamicInput;
import java.util.Scanner;

public class Bubblesort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the " + i + " element ");
		
			arr[i]=sc.nextInt();
			
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])//ascending order logic
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
				}
				
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println( arr[i]);
			
		}
		sc.close();
		
		
	}
	

}
