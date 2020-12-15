package collectioncoderjavasquad;

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		
	

	
	Map<Integer,String> h=new HashMap<Integer,String>();
	
	h.put(101, "Amit");
	h.put(102, "rohan");
	h.put(103, "Bob");
	h.put(104, "Cena");
	h.put(105, "John");
	h.put(106, "Romain");
	h.put(107, "Smith");
	
	

	Map<Integer,String> hh=new HashMap<Integer,String>();
	
	hh.put(108, "Amit");
	hh.put(109, "rohan");
	
	h.putAll(hh);
	System.out.println(h);
	
	
	Set<Integer>keyset=h.keySet();  //return set of key
	System.out.println("----- keys----");
	for(Integer i:keyset)
	{
		
		System.out.println(i);
	}
	
	
	
	//values
	System.out.println("------values------");
	Collection<String>name=h.values();
	for(String n:name)
		System.out.println(n);
	
	
	//entryset
	System.out.println("------Entryset---- ");
	System.out.println(h.entrySet());
	
	
	Set<Map.Entry<Integer, String>> map=h.entrySet();
	System.out.println(map);
	
	
	for(Map.Entry<Integer, String> m:map)
		System.out.println(m.getKey()+"  "+m.getValue());
	
	
	
	///Iterator
	System.out.println("============With iterator=========");
	
	Iterator<Map.Entry<Integer, String>>mm=h.entrySet().iterator();
	while(mm.hasNext())
	{
		Map.Entry<Integer,String>entry=mm.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
		
		
	}
		h.forEach((k,v)->System.out.println(k+" "+v));
	
	}
}