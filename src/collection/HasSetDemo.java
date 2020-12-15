package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetDemo {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		
		
		hs.add(10);
		hs.add(20);
		hs.add(null);
		hs.add(50);
		hs.add(40);
		hs.add(10);
		hs.add(30);
		System.out.println(hs);
		
		hs.add(123);
		
		System.out.println(hs.isEmpty());
		
		System.out.println(hs.contains(20));
		
		
		Iterator it=hs.iterator();
		while(it.hasNext())
		{  
			
			// hs.remove(12);
			System.out.println(it.next());
			
		}
	}
}
