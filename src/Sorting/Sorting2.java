package Sorting;
import java.util.Scanner;
import java.util.Arrays;

public class Sorting2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1=sc.next();
		char arr[]= s1.toCharArray();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
			
		
	}

}
