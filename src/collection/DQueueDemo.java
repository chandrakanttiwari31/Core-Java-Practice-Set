package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DQueueDemo {
	public static void main(String[] args) {
		Deque d=new ArrayDeque();
		
		
		d.addFirst(10);
		d.offerFirst(20);
        d.addFirst(30);
        d.addFirst(50);
        d.addLast(60);
        d.offerLast(70);
		System.out.println(d);
		
		
		
		d.getFirst();
		System.out.println(d);
		
		System.out.println("\n");
		
		
		System.out.println(d.peekFirst());
		
		System.out.println("******************");
		
		System.out.println(d.peekLast());
		
		
		System.out.println("@@@@@@@@@@@");
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		
		
		
		System.out.println("&&&&&&&&&&");
		System.out.println(d.pollFirst());
		System.out.println(d.pollLast());
		
		System.out.println("%%%%%%%%%%");
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
	}
}
