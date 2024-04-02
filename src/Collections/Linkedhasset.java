package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhasset {
	public static void main(String[] args) {
		HashSet  s1=new LinkedHashSet();
		s1.add("Hello");
		s1.add('A');
		s1.add(null);
		s1.add(20.56);
		s1.add(true);
		s1.add("Hello");
		System.out.println(s1);
				
			
	}

}
