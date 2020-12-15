package collectioncoderjavasquad;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListDemo4 {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("roohan");
		
		list.add("smith");
		list.add("bob");
		System.out.println(list);
		
		
		List<String>list1=new ArrayList<>();
		list1.add("chetan");
		list1.add("mohan");
		list.addAll(list1);
		System.out.println(list);
		
		
		
		
		List<String>list2=new ArrayList<>();
		list2.add("chetan");
		list2.add("mohan");
		list2.add("jack");
		
		list.removeAll(list2);
		System.out.println(list);
		
		
		System.out.println(list.indexOf("smith"));
		System.out.println(list.lastIndexOf("bob"));
		System.out.println(list.contains("bob"));
		
		
		
		System.out.println(list.get(2));
		list.set(2, "chandan");
		System.out.println(list);
		
		
		
		
		
		System.out.println("consumer interface");
		
		
		Consumer c= new Consumer() {

			@Override
			public void accept(Object t) {
				// TODO Auto-generated method stub
				
				System.out.println(t);
			}
					};
		
					
					c.accept(list);
		
					System.out.println(list);
					
					System.out.println("consumer wsith lamda function");
					
					Consumer c1=(n)->System.out.println(n);
					c1.accept(list);
					
					
					
					System.out.println("for each method");

					
					list.forEach(c1);
		System.out.println("lamda exooression");
		
		list.forEach((n)->System.out.println(n));
		
	}

}
