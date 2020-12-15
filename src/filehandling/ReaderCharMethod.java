package filehandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderCharMethod {
	public static void main(String[] args) {
		{
			
			try(Reader r=new FileReader("read1.txt");)
			
			{
				
				char s[]=new char[100];
				int a=r.read(s);
				
				String ss=new String(s);
				System.out.println(s);
				
				//System.out.println(a);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
