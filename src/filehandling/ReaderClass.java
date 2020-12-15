package filehandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderClass {

	
	public static void main(String[] args) {
		{
			
			try(Reader r=new FileReader("read1.txt");)
			
			{
				
				//char s[]=new char[100];
				int a=r.read();
				
				while(a!=-1)
				{
					System.out.print((char)a);
					a=r.read();
				}
				
				System.out.println(a);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
