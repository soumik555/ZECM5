package Collectionslogic;

import java.util.TreeSet;

public class Collectionautosortedarraymix {
	public static void main(String[] args) {
		TreeSet<Integer> t1=new TreeSet();
		int arr[]= {100,90,81,25,10,5};
		for(int i=0;i<arr.length;i++)
		{
			t1.add(arr[i]);
			
		}
		System.out.println(t1);//autosorted
		
		Object obj[]=t1.toArray();
		for(int i=obj.length-1;i>=0;i--)
		{
			System.out.println(obj[i]);
			
		}
	}

}
