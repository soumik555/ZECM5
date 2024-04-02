package Collections;

import java.util.ArrayList;

public class Size1 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Hello");
		a1.add(10);
		a1.add(24.56);
		a1.add('H');
		
		
		System.out.println("Size of the list is "   + a1.size());
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i)+" index " + i);
			
		}
		
	}

}
