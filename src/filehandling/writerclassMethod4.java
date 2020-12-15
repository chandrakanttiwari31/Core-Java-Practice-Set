package filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class writerclassMethod4 {

	
	
	public static void main(String[] args) {
		try(Writer w=new FileWriter("w4.txt"))
		{
			char s[]= {'a','b','c'};
			
			w.write(s, 0, 2);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
