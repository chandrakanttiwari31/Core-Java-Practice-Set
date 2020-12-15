package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputWriteByte2 {

	
	public static void main(String[] args) {
		{
			
			try(OutputStream o=new FileOutputStream("write1.txt",true))
			{
				String s="WELCOME TO JAVA";
			    byte b[]=s.getBytes();
				o.write(b);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
