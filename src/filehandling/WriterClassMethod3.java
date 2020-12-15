package filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterClassMethod3 {

	public static void main(String[] args) {
		try(Writer w=new FileWriter("w3.txt"))
		{
			String s="Java programming";
			char[] c=s.toCharArray();
			w.write(c, 0, 6);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
