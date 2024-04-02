package Collections;

import java.util.ArrayList;

public class Collections2 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(56.89);
		a1.add("Hello");
		a1.add('A');
		a1.add("Hello");
		a1.add(null);
		
		
		ArrayList a2=new ArrayList();
		a2.add(20);
		a2.add(56.89);
		a2.add("Hello");
		a2.add('A');
		
		
		System.out.println("Before " + a1);
		System.out.println("Before " + a2);
		a1.add(a2);
		System.out.println("After " +a1);
	}

}
