package collection;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		
		v.addElement(5);
		v.addElement("Thane");
		v.addElement(null);
		System.out.println(v);
		
		System.out.println("First Element="+v.firstElement());
		System.out.println("Last element ="+v.lastElement());
		
		for(int i=0;i<=4;i++)
		{
			
			System.out.println(v);
			
			v.removeElementAt(i);
		}
		
		System.out.println(v);
		
	}

}
