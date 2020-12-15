package collectioncoderjavasquad;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



//  it follow acending order


public class TreeSetDemo {

	
	public static void main(String[] args) {
		
		
		Set<Customer> s=new TreeSet();
		 Customer c=new Customer(1,"pooja,",18,9999999); 
		 Customer c1=new Customer(2,"rohan,",20,888888); 

		 Customer c2=new Customer(3,"smith,",44,575475); 

		 Customer c3=new Customer(4,"payal",26,44444); 
		 
		s.add(c);
		s.add(c1);
		s.add(c2);
		s.add(c3);
		
		//HashSet<Customer> h1=new HashSet<>(s);
		
		Iterator<Customer> i=s.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}
