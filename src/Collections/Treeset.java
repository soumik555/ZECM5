package Collections;

import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		int arr[]= {10,10,10,40,50,60};
		for(int i=0;i<arr.length;i++)
		{
			t1.add(arr[i]);
			
		}
		System.out.println(t1);
	}

}
