package collectioncoderjavasquad;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	
	public static void main(String[] args) {
		 ArrayList<Employee> ll=new ArrayList();
		 
		 Employee e1=new Employee(1,"smith",1000,3655459);
			Employee e2=new Employee(2,"bob",2000,2222222);
			Employee e3=new Employee(3,"smith",3000,333333);
			Employee e4=new Employee(4,"smith",4000,44444);
			
			ll.add(e1);
			ll.add(e2);
			ll.add(e3);
			ll.add(e4);
			
			
			Collections.sort(ll,new  idCompare());
			
			for(Employee e:ll)
			{
				
				System.out.println(e);
			}
			System.out.println("*********");
			
			Collections.sort(ll,new nameCompare());
			
			for(Employee ee:ll)
			{
				
				System.out.println(ee);
			}
	}

}
