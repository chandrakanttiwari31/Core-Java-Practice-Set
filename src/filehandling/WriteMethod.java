package filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteMethod {

	
	public static void main(String[] args) {
		try(Writer w=new FileWriter("w2.txt",true))
		{
			String s="Java programming";
			
			w.write(s);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
