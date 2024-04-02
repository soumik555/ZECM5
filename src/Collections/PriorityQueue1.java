package Collections;

import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		PriorityQueue<Integer> p1=new PriorityQueue<>();
		p1.add(10);
		p1.add(20);
		p1.add(70);
		p1.add(67);
		p1.add(19);
		System.out.println(p1);
		
		System.out.println("Peeking");
		System.out.println(p1.peek());
		System.out.println(p1);
		
		System.out.println("Pooling");
		System.out.println(p1.poll());
		System.out.println(p1);
		
	}

}
