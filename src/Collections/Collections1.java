package Collections;

import java.util.ArrayList;

public class Collections1 {
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(25.67);
		a1.add('H');
		a1.add("Hello");
		a1.add(null);
		System.out.println("Before "   + a1);
		a1.add(2,"Soumik");
		System.out.println("After " + a1);
	}

}
