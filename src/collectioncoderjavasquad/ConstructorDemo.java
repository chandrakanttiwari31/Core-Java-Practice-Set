package collectioncoderjavasquad;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ConstructorDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> l=new ArrayList();
		l.add("neha");
		l.add("raj");
		
		LinkedList<String>ll=new LinkedList(l);
		System.out.println(ll);
		
		
		Vector v=new Vector();
		
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		
		
		
		
		
		Stack s=new Stack();
		
		System.out.println(s);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		
	}

}
