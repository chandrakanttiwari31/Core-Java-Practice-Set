package collectioncoderjavasquad;

import java.util.*;

public class EmpHashMApDemo {
	public static void main(String[] args) {
		
	
	
HashMap<Integer,Emp11> m=new LinkedHashMap();

   m.put(111, new Emp11(111,"Smith",1000));
   m.put(114, new Emp11(114,"Bob",3000));
   m.put(112, new Emp11(112,"JAck",5000));
   m.put(116, new Emp11(116,"Cena",9900));

   
   System.out.println(m);
   
   
   
   m.forEach((k,v)->System.out.println(k+" "+v));
   
   
   
   
  HashMap<Integer,String> mm=new LinkedHashMap();
    mm.put(1, "pooja");
    mm.put(2, "Kishan");
    mm.put(5, "Rakesh");
    mm.put(3, "Rohan");
    mm.put(null, "Sahil");
    mm.put(null, "Ragini");
    System.out.println(mm);
    
    
    System.out.println("Using Iterator");
    Iterator<Map.Entry<Integer, String>>map=mm.entrySet().iterator();
	while(map.hasNext())
	{
		Map.Entry<Integer,String>entry=map.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
		
		
	}
	
	System.out.println();
	System.out.println("Using foreach");
	mm.forEach((k,v)->System.out.println(k+" "+v));

	
	System.out.println(mm.containsKey(1));
	System.out.println(mm.size());
	System.out.println(mm.isEmpty());
	System.out.println(mm.get(2));
	
	
	
	
	}
}
