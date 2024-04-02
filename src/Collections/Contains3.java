package Collections;

import java.util.ArrayList;

public class Contains3 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20.56);
		a1.add("Hello");
		a1.add("Bye");
		
		
		if(a1.contains("Hello"))
		{
			System.out.println(a1.get(a1.indexOf("Hello")));
		}
			
			
		
	}

}
