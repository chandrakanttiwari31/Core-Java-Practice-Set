package collection;

import java.util.TreeSet;

public class TreeSetStringDecendingDemo {

	
	
	public static void main(String[] args) {
		 TreeSet s=new TreeSet<>();
		 
		 s.add(10);
		 s.add(20);
		 s.add(30);
		 s.add(40);
		 s.add(50);
		 s.add(60);
		 System.out.println(s);
		 
		 System.out.println("Decending orderS");
		 System.out.println(s.descendingSet());
		 
}

}
