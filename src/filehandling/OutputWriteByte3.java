package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputWriteByte3 {
	public static void main(String[] args) {
		{
			
			try(OutputStream o=new FileOutputStream("write2.txt",true))
			{
				String s="WELCOME TO JAVA";
			    byte b[]=s.getBytes();
			    o.write(b, 0,5 );
			   
				
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
