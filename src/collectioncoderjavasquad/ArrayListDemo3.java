package collectioncoderjavasquad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo3 {
	
	
public static void main(String[] args) {
		
		List<String> name=new ArrayList();
		name.add("Smith");
		name.add("bob");
		name.add("mohan");
		name.add("rohan");
	
		
		
		ListIterator<String> ll=name.listIterator(name.size());
		while(ll.hasPrevious())
				{
			
			System.out.println(ll.previous());
				}
		
				

		Iterator<String> i= name.iterator();

						while(i.hasNext())
								{
								
								System.out.println(i.next());
								
								}
								
								
			System.out.println(name.isEmpty());
			
			
			
			System.out.println(name.remove(1));
			
			System.out.println(name.remove("rohan"));
			
			System.out.println(" ");
			System.out.println(name);
			
			
			
								}


}
		
