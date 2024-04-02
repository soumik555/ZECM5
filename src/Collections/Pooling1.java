package Collections;

import java.util.LinkedList;

public class Pooling1 {
	public static void main(String[] args) {
		LinkedList<Integer> a1=new LinkedList<>();
		a1.add(10);
		a1.add(20);
		a1.add(90);
		a1.add(60);
		System.out.println("Peeking");
		System.out.println(a1.peek());
		System.out.println(a1);
		System.out.println(a1.poll());
		System.out.println(a1);
		
	}

}
