package filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterMethod5 {

	
	public static void main(String[] args) {
		try(Writer w=new FileWriter("w5.txt"))
		{
			char s[]= {'a','b','c','d','e','f','g'};
			
			w.write(s);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
