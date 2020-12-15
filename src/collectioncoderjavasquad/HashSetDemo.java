package collectioncoderjavasquad;


import java.util.Collections;
//  it   doesnot follow  inseartion ordr
//non syn
//doesnot all duplecate value
//only  one null allow
// comes in 1.2v
//extends AbstractSet and implements Set
//
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<BookRecord> h=new HashSet();
//		BookRecord b=new BookRecord(1,"java","gems");
//		BookRecord b1=new BookRecord(2,"c","denis");
//		BookRecord b2=new BookRecord(3,"c++","Bajane");
//		BookRecord b3=new BookRecord(4,"python","gaido");
		
//		h.add(b);
//		h.add(b1);
//		h.add(b2);
//		h.add(b3);
		Iterator i=h.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
//		Set<String> c=new HashSet();
//		c.add("blue");
//		c.add("black");
//		c.add("yellow");
//		c.add("null");
//		c.add("blue");
//		
//		for(String s:c)
//			System.out.println(s);
	}
}
