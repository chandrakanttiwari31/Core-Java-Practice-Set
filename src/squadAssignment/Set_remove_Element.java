package squadAssignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set_remove_Element {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Set<String> s=new HashSet();
		
		s.add("Smith");
		s.add("Rohan");
		s.add("Rohit");
		s.add("pooja");
		s.add("payal");
		
		System.out.println("*********Element  of Set Interface=**************");
		System.out.println(s);
		
		s.remove("Smith");
		System.out.println("*******************After removing**************");
		System.out.println(s);
	}
}
