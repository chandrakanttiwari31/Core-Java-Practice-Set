package collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedhashMApDemo {

	
	public static void main(String[] args) {
		Map<Integer,String> h=new LinkedHashMap<Integer,String>();
		
		h.put(101, "Amit");
		h.put(102, "rohan");
		h.put(103, "Bob");
		h.put(104, "Cena");
		h.put(105, "John");
		h.put(106, "Romain");
		h.put(107, "Smith");
		
		System.out.println(h);
	     
	 System.out.println("All keys:="+h.keySet());
	 System.out.println("All values:="+h.values());
	 
	 System.out.println("All keys and values:="+h.entrySet());
	 
	 
	 Iterator<Entry<Integer,String>> it=h.entrySet().iterator();
	  while(it.hasNext())
	  {
		  
		  System.out.println(it.next());
	  }
		
	}
	
	
}
