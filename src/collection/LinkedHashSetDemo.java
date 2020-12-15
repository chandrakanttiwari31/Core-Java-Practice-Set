package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	
	
	public static void main(String[] args) {
		LinkedHashSet ls=new LinkedHashSet();
		
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(null);
		
		System.out.println(ls);
		
		ls.remove(1);
		
		System.out.println(ls);
		
		
		System.out.println("Contains:"+ls.contains(3));
		
		
		
		System.out.println("size:"+ls.size());;
		
		
		
		
		
		System.out.println();
		
		
		Iterator it=ls.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
	}
}
