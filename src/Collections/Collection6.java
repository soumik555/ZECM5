package Collections;

import java.util.ArrayList;

public class Collection6 {
	public static void main(String[] args) {
       ArrayList a1=new ArrayList();
		
		a1.add(10);
		a1.add(25.67);
		a1.add('H');
		a1.add("Hello");
		a1.add(null);
		
		
		ArrayList a2=new ArrayList();
		a2.add(60);
		a2.add(25.67);
		a2.add('H');
		a2.add("Hello");
		a2.add(null);
		
		System.out.println("Before" +a1);
		System.out.println("Before" +a2);
		a1.retainAll(a2);
		System.out.println("Retain All" +a1);// RetainAll allows duplicates and removes unique
	}

}
