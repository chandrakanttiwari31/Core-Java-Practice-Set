package collectioncoderjavasquad;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DqueueDemo {

	public static void main(String[] args) {
		
		
		Deque d=new LinkedList();
		
		
		d.addFirst(10);
		d.offerFirst(20);
        d.addFirst(30);
        d.addFirst(50);
        d.addLast(60);
        d.offerLast(70);
		System.out.println(d);
		System.out.println("************");
		
		d.addFirst(11);
		System.out.println(d);
		
		d.addLast(33);
		
		System.out.println(d);
		
		d.offerFirst(44);
		System.out.println(d);
		
		d.offerLast(88);
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
		
		System.out.println(d.removeFirst());
		System.out.println(d.removeLast());
	}
	
}
