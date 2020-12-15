package collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	
	public static void main(String[] args) {
		Map<Character,Integer> h=new TreeMap<>();
		
		h.put('W',10);
		h.put('B',40);
		h.put('X',20);
		h.put('N',11);
		
		System.out.println(h);
		
		Iterator<Entry<Character,Integer>> it=h.entrySet().iterator();
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		}
		
}

	
}
