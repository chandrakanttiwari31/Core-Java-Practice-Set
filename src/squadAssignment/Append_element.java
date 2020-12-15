package squadAssignment;

import java.util.HashSet;
import java.util.Scanner;

public class Append_element {
	
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
		
		for(String ss:s)
		{
			System.out.println(ss);
		}
		
		
	}

}
