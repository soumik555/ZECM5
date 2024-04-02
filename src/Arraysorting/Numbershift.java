package Arraysorting;

public class Numbershift {
	public static void main(String[] args)
	{
		
		int arr[]= {10,20,30,40};
		
		for(int i=0;i<2;i++)
		{
			int temp=arr[arr.length-1];
			for(int j=arr.length-1;j>=1;j-- )
			{
				arr[j]=arr[j-1];
				
			}
			arr[0]=temp;
		}
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
				
			}
			
		}
		
		
	}


