package filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterClass1 {
	 public static void main(String[] args) {
		try(Writer w=new FileWriter("w1.txt"))
		{
			//String s="JAva PRogramming";
		     
		w.write(67);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
