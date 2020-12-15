package filehandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderChar3Method {
	public static void main(String[] args) {
		
	
	try(Reader r=new FileReader("read1.txt"))
	
	{
		
		char s[]=new char[100];
		int a=r.read(s, 0, 4);
		for(int i=0;i<a;i++)
		{
			System.out.print((char)s[i]);
		}
		
		System.out.println("\n");
	
	//or second method 
	String ss=new String(s);
	
	System.out.println(ss);
	}
	
	 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }
	}





}