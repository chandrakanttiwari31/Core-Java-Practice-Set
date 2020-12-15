package squadAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputArraylist {
public static void main(String[] args) {
	
	
	ArrayList<String> a=new ArrayList();
	Scanner sc=new Scanner(System.in);
    String s;
	 char ch;
	 do {
	 System.out.println("enter your element");
	 
	 s=sc.next();
	 a.add(s);
		
		System.out.println("if u continue press  y");
		
		ch=sc.next().charAt(0);
		
	
		}
		while(ch=='Y'|| ch=='y');
	 
	 for( String ss:a)
	 {
		 
		System.out.println(ss); 
	 }
	 
	 
}
}
