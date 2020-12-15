package squadAssignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Get_ele_Fromhashset {

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<String> s=new HashSet();
		
		System.out.println("enter your object");
		int n=sc.nextInt();
		
		System.out.println("enter your element");

		for(int i=0;i<=n;i++)
			
		{
			String str=sc.next();
			s.add(str);
		}
		System.out.println("****************Your Element is=**********");
		System.out.println(s);
		
	
		int no_of_ele=s.size();
		System.out.println("**********Number of Element in hashSet************");		
		System.out.println(no_of_ele);
	    
		System.out.println();
		System.out.println("*************Check HashSet Empty or Not***********");
		System.out.println(s.isEmpty());
		
		
//		
//		Iterator it=hs.iterator();
//		while(it.hasNext())
//		{  
//			
//			// hs.remove(12);
//			System.out.println(it.next());
//			
//		}
	}
}
