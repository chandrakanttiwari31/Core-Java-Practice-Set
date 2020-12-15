package collectioncoderjavasquad;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeLinkedLIst {
	public static void main(String[] args) {
		
	
	

	
	Employee e1=new Employee(1,"smith",1000,3655459);
	Employee e2=new Employee(2,"bob",2000,2222222);
	Employee e3=new Employee(1,"smith",3000,333333);
	Employee e4=new Employee(1,"smith",4000,44444);
	
	
	LinkedList<Employee> l1=new LinkedList();
	l1.add(e1);
	l1.add(e2);
	l1.add(e3);
	l1.add(e4);
	
	Iterator<Employee> i=l1.iterator();
			
			while(i.hasNext())
			{
				
				System.out.println(i.next());
				
			}
			
}
}
