package collection;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetStringDemo {

	
	public static void main(String[] args) {
		
		SortedSet<String> s=new TreeSet<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name");
		String name;
		for(int i=0;i<=5;i++)
		{
			
			name=sc.next();
			s.add(name);
		}
		System.out.println(s);
	}

}
