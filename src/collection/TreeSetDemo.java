package collection;
// Tree Set contains only homogeneous element
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		 SortedSet<Integer> s=new TreeSet<Integer>();
		 
		 s.add(10);
		 s.add(20);
		 s.add(30);
		 s.add(40);
		 
		 s.add(50);
		 s.add(60);
		 System.out.println(s);
		 
		 
		 
		 System.out.println(s.subSet(20, 50));
		 
		 System.out.println("HeadSet:"+s.headSet(50));
		 
		 System.out.println(s.tailSet(50));
		 
		 System.out.println(s.first());
		 System.out.println(s.last());
	}

}
