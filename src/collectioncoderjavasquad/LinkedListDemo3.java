package collectioncoderjavasquad;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList();
		l.add("neha");
		l.add("pooja");
		l.add("shreya");
		l.add("anjali");
		l.add("pooja");
		l.add("jyoti");
		l.add("jagrti");
		
		l.add(null);
		
		l.removeFirstOccurrence("pooja");
		System.out.println(l);
		
		l.removeLastOccurrence("pooja");
		System.out.println(l);
		
		
		
		System.out.println("peek method");
		System.out.println(l.peek());//retrive head but not remove
		System.out.println(l);
		
		
		System.out.println("poll method");
		System.out.println(l.poll());//retrive head and removes
		System.out.println(l);
		
		
		
	}
}
