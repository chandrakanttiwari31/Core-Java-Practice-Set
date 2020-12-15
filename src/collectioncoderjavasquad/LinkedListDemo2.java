package collectioncoderjavasquad;

import java.util.LinkedList;

public class LinkedListDemo2 {
	
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList();
		l.add("neha");
		l.add("pooja");
		l.add("shreya");
		l.add("anjali");
		l.add("pooja");
		l.add(null);
		
		
		System.out.println(l);

		
		int len=l.size();
		System.out.println("size of object"+len);
		
		System.out.println("get the values of   element"+l.get(2));
		System.out.println("get the first eleement"+l.getFirst());
		System.out.println("get the last element"+l.getLast());
		
		System.out.println("find the index value of eleement"+l.indexOf("shreya"));
		System.out.println("find the last index"+l.lastIndexOf("pooja"));
		
		System.out.println("check either empty or not "+l.isEmpty());
		System.out.println("check either object contain the element or not="+l.contains("pooja"));
		
		
	    System.out.println("after the remove element");	
	    System.out.println(l.remove());
		l.remove();//  remove the head of first element
		System.out.println(l);
		
		
		l.remove(2);
		System.out.println(l);
		
		
		System.out.println(l.indexOf("yyyy"));
		
}
}