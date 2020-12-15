package collectioncoderjavasquad;

import java.util.*;

public class TreeMapDemo {
	
	
	public static void main(String[] args) {
		
		

		
		NavigableMap<Integer,String> h=new TreeMap<Integer,String>();
		
		h.put(101, "Amit");
		h.put(133, "rohan");
		h.put(107, "Bob");
		h.put(104, "Cena");
		h.put(109, "John");
		h.put(106, "Romain");
		h.put(100, "Smith");
		
		System.out.println(h);
		
		System.out.println(h.descendingMap());
		
		 Iterator<Map.Entry<Integer, String>>map=h.entrySet().iterator();
			while(map.hasNext())
			{
				Map.Entry<Integer,String>entry=map.next();
				System.out.println(entry.getKey()+" "+entry.getValue());
		
		

	}
	}
}
