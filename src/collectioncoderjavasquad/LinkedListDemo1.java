//it accet duplicate value
//it also maintain insertion order
//non-syn
//better to use for manipulation
//we can use   either list or queuq/dqueue also
//also know as doubley linkedlist
//accept null values
// use too  implementing dqueue





package collectioncoderjavasquad;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList();
		l.add("neha");
		l.add("pooja");
		l.add("shreya");
		l.add("anjali");
		l.add("pooja");
		l.add(null);
		
		
		System.out.println(l);
		
		l.addFirst("reena");
		l.addLast("rakesh");
		System.out.println(l);
		
		l.removeFirst();
		
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		
		
		
		
		
		
		
	}
}
