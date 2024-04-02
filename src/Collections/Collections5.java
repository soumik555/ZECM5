package Collections;

import java.util.ArrayList;

public class Collections5 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		a1.add(10);
		a1.add("Hello");
		a1.add('A');
		a1.add(null);
		
		
		ArrayList a2=new ArrayList();
		a2.add(10);
		a2.add(56.89);
		a2.add("Hello");
		a2.add("Bye");
		a2.add("ok");
		a2.add("ol");
		
		System.out.println("Before" +a1);
		System.out.println("Before" +a2);
		a2.removeAll(a1);
		System.out.println("Remove All" +a2);
		
	}

}
