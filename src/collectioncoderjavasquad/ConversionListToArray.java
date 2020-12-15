package collectioncoderjavasquad;

import java.util.*;

public class ConversionListToArray {
	
	public static void main(String[] args) {
		
		List<String> l=new ArrayList();
		
		l.add("name");
		l.add("age");
		
		
		String s[]=new String[4];
		
		for(int i=0;i<l.size();i++)
		{
			s[i]=l.get(i);
			
		}
		
		
		for(String ss:s)
		{
			
			System.out.println(ss);
		}
	}

}
