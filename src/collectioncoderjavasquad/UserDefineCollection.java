package collectioncoderjavasquad;

import java.util.ArrayList;
import java.util.Scanner;

public class UserDefineCollection {

	
	public static void main(String[] args) {
		
		char ch;
		ArrayList<Strudent> list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		
		Strudent s=null;
		
		int rollno;
		String name;
		
		
		do {
		System.out.println("Enter student roll no");;
		rollno=sc.nextInt();
		
		System.out.println("enter student name");;
		name=sc.next();
		
		s=new Strudent(rollno, name);
		list.add(s);
		
		System.out.println("if u continue pre   y");
		
		ch=sc.next().charAt(0);
		
	
		}
		while(ch=='Y'|| ch=='y');
		
	for(Strudent s1:list)
		System.out.println(s1);
		
				
	}
}
