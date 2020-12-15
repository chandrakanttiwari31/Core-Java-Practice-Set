package collectioncoderjavasquad;

import java.util.ArrayList;

public class ArrayListDemo5 {
	
	public static void main(String[] args) {
		//type safety
		
		String name[]=new String[15];
		
		name[0]="pandey";
		name[1]="tiwari";
		name[2]="dubey";
		//name[3]=34;
		
		
		
		//non generic collection
		//no type safety
		
		ArrayList  list=new ArrayList();
		
		list.add("mohan");
		list.add(34);
		list.add(null);
		
		String s=(String) list.get(2);
		
		
		
		
		//gemeric collection
		
ArrayList<String>  list1=new ArrayList();
		
		list1.add("mohan");
		list1.add("rakesh");
		list1.add("rohan");
		String ss=list1.get(0);
		
		
	}
	
	
	

}
