package Collections;

import java.util.HashSet;
import java.util.Set;

public class Hashset1 {
	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<>();//upcasting
		s1.add(10);
		s1.add(56);
		s1.add(90);
		s1.add(89);
		s1.add(77);
		System.out.println(s1);
		
	}

}
