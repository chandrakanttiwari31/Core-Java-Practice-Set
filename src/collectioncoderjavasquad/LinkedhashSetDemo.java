package collectioncoderjavasquad;


///  linked hash Set follow  inseartion order
//  come in 1.4
// child class
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedhashSetDemo {

	
	public static void main(String[] args) {
		
		
		Set<String> c=new LinkedHashSet();
		c.add("blue");
		c.add("black");
		c.add("yellow");
		c.add("null");
		c.add("blue");
		
		TreeSet<String> t=new TreeSet<>(c);
		
		for(String s:t)
			System.out.println(s);
	}
}
