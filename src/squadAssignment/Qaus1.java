package squadAssignment;

import java.util.ArrayList;

public class Qaus1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList();
		
		list.add("jack");
		list.add("Bob");
		list.add("jimmy");
		list.add("cena");
		System.out.println(list);
		System.out.println();
		
		System.out.println("==============Adding element in the First Position=========== ");
		list.add(0, "Romain");
		System.out.println(list);
		
		System.out.println();
		
		
		
		
		
		// qus 2 Retrive the Element at Specific index from given Arraylist
		
		System.out.println("================Retrive element form arraylist==========");
		System.out.println(list.get(2));
		
		
		
		
		// qus 3 upadte the  specific element  of arraylist
		
		
		System.out.println();
		System.out.println("=============Updating the Element from AaarayList==================");
		System.out.println("Before Update the Elememt="+list);
		System.out.println(list.set(1, "Pooja"));
		System.out.println("After Update the Elememt="+list);

		
		//qus 4 Removing element foem arraylist
		
		System.out.println("================Removing  Specfic elementformArrayList======== ");
		System.out.println("Before removing element lfrom arraylist="+list);
		System.out.println("After removing element from arraylist"+list.remove(1));
		
		System.out.println();
		
		//qus 5 searching element in arraylist
		
		System.out.println("=======searching element form arraylist=====");
		System.out.println(list.get(1));
		
		
	}
}
