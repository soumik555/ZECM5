package Collections;

import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		
		v1.add(10);
		v1.add(20);
		v1.add(30.67);
		v1.add("Hello");
		
		
		Object arr[]=v1.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
	}

}
