package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(1);
	a.add(2);
	a.add("RAkesh");
	a.add(null);
	a.add(2);
	System.out.println(a);
	
	
	ArrayList aa=new ArrayList();
	aa.add(5);
	aa.add("Smith");
	aa.add(null);
	
	System.out.println(aa);
	a.add(aa);
	System.out.println(a);
	a.remove(0);
	System.out.println(a);
	
	System.out.println("***********");
	a.size();
	
	
	
	
	
	
	Iterator it =a.iterator();
	while(it.hasNext())
		System.out.println(it.next());
}
}
