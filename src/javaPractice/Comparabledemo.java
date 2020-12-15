package javaPractice;

import java.util.*;

class ComparableDemo
{
public static void main(String[] args) {
	List<Student1> l=new ArrayList<Student1>();
	l.add(new Student1(1, "chandan",23));
	l.add(new Student1(2, "deepak", 18));
	l.add(new Student1(3, "tiwari", 24));
	
	Collections.sort(l);
	for(Student1 ss:l)
	{
		
		System.out.println(ss.id+" "+ss.name+" "+ss.age);
	}
	
}	
}


class Student1 implements Comparable<Student1>
{
  int id;
  String name;
  int age;
public Student1(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}

public int compareTo(Student1 st) {
	if(age==st.age)
		return 0;
	else if(age>st.age)
		return  1;
	else
		
	return -1;
}



  
}