package collectioncoderjavasquad;

import java.util.*;
import java.util.TreeMap;

public class TreeMapBookDemo {
	
	public static void main(String[] args) {
		Map<Integer,BookRecord> h=new TreeMap();
		
		h.put(1, new BookRecord(101,"java"));
		
		h.put(2, new BookRecord(201,".net"));
		h.put(3, new BookRecord(301,"python"));
		
		//System.out.println(h);
		
		  h.forEach((k,v)->System.out.println(k+" "+v));
		
		
		
		
	}

}
