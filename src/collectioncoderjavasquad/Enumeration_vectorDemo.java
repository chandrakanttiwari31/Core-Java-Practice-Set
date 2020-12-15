package collectioncoderjavasquad;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_vectorDemo {
	
	
	public static void main(String[] args) {
		Vector v=new Vector();
	 for(int i=0;i<=10;i++)
	 {
		 
		 v.addElement(i);
	 }
	 Enumeration e=v.elements();
	 while(e.hasMoreElements())
	 {
		 
		 Integer i=(Integer)e.nextElement();
		 System.out.println(i);
	 }
	 
		
	}

}
