package Collections;

import java.util.ArrayList;//using contains method



public class Collection8 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add("Hello");
		a1.add('A');
		a1.add(null);
		
	
		
		
			if(a1.contains("Hello"))
			{
				
				System.out.println(a1.get(a1.indexOf("Hello")));
				
			}
			
		
		
	}

	

}
