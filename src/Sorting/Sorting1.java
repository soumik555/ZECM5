package Sorting;
import java.util.Scanner;
import java.util.Arrays;

public class Sorting1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the " + i + " element");
			arr[i]=sc.nextInt();
			
			
			
		}
		for(int i=0;i<arr.length;i++)
		{
			Arrays.sort(arr);
			
		}
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
			
		}
	}

}
