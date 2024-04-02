package Collections;

import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		Object arr[]= {1,45,60,70};
		for(int i=0;i<arr.length;i++)
		{
			v1.add(arr[i]);
			
		}
		System.out.println(v1);
	}

}
