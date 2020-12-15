package squadAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrrayListRemove {

	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<String> l=new ArrayList();
		
		System.out.println("enter your object");
		int n=sc.nextInt();
		
		System.out.println("enter your element");
		for(int i=0;i<n;i++)
		{
			
			String s=sc.next();
					l.add(s);
					
		}
		System.out.println(l);
		for(int i=0;i<n;i++)
		{
			
			if(i==2)
			{
				l.remove(i);
				
			}
		}
		
		System.out.println();
		for(String s1:l)
		{
			
			System.out.println(s1);
		}
}
}
