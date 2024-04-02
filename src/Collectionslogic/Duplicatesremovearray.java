package Collectionslogic;


import java.util.Set;
import java.util.TreeSet;

public class Duplicatesremovearray {
	public static void main(String[] args) {
		int arr[]= {3,6,1,2,6,3,6};
		Set<Integer> s1=new TreeSet();
		for(int i=0;i<arr.length;i++)
		{
			s1.add(arr[i]);
			
		}
		System.out.println(s1);
		
		Object b[]=s1.toArray();
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.println(b[i]);
			
		}
		
	}

}

