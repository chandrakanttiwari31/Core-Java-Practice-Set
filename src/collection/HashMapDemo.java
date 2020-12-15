package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	
	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		
		h.put(101, "Amit");
		h.put(102, "rohan");
		h.put(103, "Bob");
		h.put(104, "Cena");
		h.put(105, "John");
		h.put(106, "Romain");
		h.put(107, "Smith");
		
		System.out.println("Map Afetr Invoking put:=");
		System.out.println(h);
		
		
		System.out.println("Map Afetr Invoking putifAbsent():=");
		System.out.println(h.putIfAbsent(108, "Smriti"));
		
		
		for(Map.Entry m:h.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
	
		System.out.println("Initial List of Elements:");
		
		map.put(101,"Rakesh");
		for(Map.Entry m1:h.entrySet())
		{
			System.out.println(m1.getKey()+" "+m1.getValue());
			
		}
		
		
		
		
		
		System.out.println("===============");
		map.putAll(h);
		
		for(Map.Entry m1:h.entrySet())
		{
			System.out.println(m1.getKey()+" "+m1.getValue());
			
		}
		
		
		System.out.println("Removing kay");
		map.remove(101);
		System.out.println(map);
		
		System.out.println("key values based Removal");
		map.remove(103,"bob");
		
		System.out.println("Updated lisbt of Element;="+map);
		
		
		
		
		System.out.println("Replace method");
		map.replace(105, "Swati");
		System.out.println("Updated list Element:="+map);
		
		System.out.println("Replace all Element");
		map.replaceAll((k,v)->"Ajay");
		System.out.println(map);
		
	
		
		
		
		
		
		
		
	}
	
	
}
