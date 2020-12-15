package squadAssignment;

import java.util.HashSet;
import java.util.Set;

public class Set_comparesion {
	
	public static void main(String[] args) {
Set<String> s=new HashSet();
		
		s.add("Smith");
		s.add("Rohan");
		s.add("Rohit");
		s.add("pooja");
		s.add("payal");
		
		System.out.println("*********Element  of 1st Set Interface=**************");
		System.out.println(s);
		
		Set<String> ss=new HashSet();
		
		ss.add("Smith");
		ss.add("Rohan");
		ss.add("Rohit");
		ss.add("pooja");
		//ss.add("payal");
		
		System.out.println("*********Element  of 2st Set Interface=**************");
		System.out.println(s);
		
		System.out.println("********* Comparesion between 2 Set*************");
		
		
		if(s.equals(ss))
		{
			
			System.out.println(s);
		}
		
		
		
		
	}

}
