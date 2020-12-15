package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamReadMethod {

	
	public static void main(String[] args) {
		{
			
			try(InputStream is=new FileInputStream("read1.txt"))
			{
				byte content[]=new byte[is.available()];
				int a=is.read(content);
				
				for(int i=0;i<content.length;i++)
				{
					
					System.out.print((char)content[i]);
				}
				
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
