package collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		
		ll.add(1);
		ll.add(2);
		ll.addFirst(5);
		ll.addLast(7);
		System.out.println(ll);
		
		
		System.out.println(ll.getFirst());
		
		System.out.println(ll.getLast());
		
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
	
		
	}
}
