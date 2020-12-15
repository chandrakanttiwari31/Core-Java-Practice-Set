package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SetUniqeProperty {
	public static void main(String args[]) {
		List<String> l=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name");	
		String  name;
		for(int i=0;i<=5;i++)
		{
			
			name=sc.next();
			l.add(name);
		}
		
		System.out.println(l);
		
		
		
		Set<String> s=new HashSet<String>(l);
		
		
		for(String ss:s)
		{
			
			System.out.println(ss);
		}
		
		
		Set<String> s1=new LinkedHashSet<String>(l);
		
		System.out.println("===============");
		
		for(String sss:s1)
		{
			
			System.out.println(sss);
		}
	}
}
