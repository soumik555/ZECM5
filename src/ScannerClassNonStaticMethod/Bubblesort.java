package ScannerClassNonStaticMethod;
import java.util.Scanner;

public class Bubblesort {
	
	void bubblesort()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the  " +  i + " element");
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				     int temp=arr[i];
				     arr[i]=arr[j];
				     arr[j]=temp;
					
				}
				
			}
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		sc.close();
		
		
		
		
		
	
		
		
	}
	
	
		
	
	
	
	public static void main(String[] args) {
		Bubblesort b1=new Bubblesort();
		b1.bubblesort();
		
	}

}
