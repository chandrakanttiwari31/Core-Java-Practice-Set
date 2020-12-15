//Array list
// it is  used for  creating  dyanamic array
// it extends abstract class and implement list interface
// can store duplicate elements
// maintain insertion order
// it is non-syn
// manipulating  is slow bcz lot of  shifting need when  we remove any data.



package collectioncoderjavasquad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add("smith");
		list.add('v');
		list.add(122);
		list.add("smith");
		list.add(10.9);
		System.out.println(list);
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		}
		
		
		System.out.println(" ");
		
		for(Object o:list)
		{
			
			System.out.println(o);
		}
		
		int i;
		int len=list.size();
		System.out.println("length is=");
		System.out.println(len);
		
		
		System.out.println("using for loop");
		for(i=0;i<len;i++)
		{
			
			System.out.println(list.get(i));
		}
	}
}












