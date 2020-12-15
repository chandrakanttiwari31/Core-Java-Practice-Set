package javaPractice;

import java.util.Comparator;
import java.util.*;

public class Comparatordemo {
	public static void main(String[] args) {
		
		List<Student> l=new ArrayList();
		l.add(new Student(1, "chandan",23));
		l.add(new Student(2, "deepak", 40));
		l.add(new Student(3, "tiwari", 24));
		
		System.out.println("Compare  by name");
		Collections.sort(l,new NameComparator());
		
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			Student st=(Student)i.next();
			System.out.println(st.id+" "+st.name+" "+st.age);
		}
		
		
		
		System.out.println("Compare by Age");
		Collections.sort(l,new AgeComparator());
		Iterator ii=l.iterator();
		while(ii.hasNext())
		{
			Student s=(Student)ii.next();
			System.out.println(s.id+" "+s.name+" "+s.age);
			
		}
	}

}


class Student
{
  int id;
  String name;
  int age;
public Student(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
  
  
}

class AgeComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		
		if(s1.age==s2.age)
			return 0;
		else if(s1.age>s2.age)
			return 1;
		else
		
		
		return -1;
	}

}


class NameComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;

		return s1.name.compareTo(s2.name);
	}
	
}
