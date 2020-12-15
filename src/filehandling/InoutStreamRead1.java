package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InoutStreamRead1 {
	public static void main(String[] args) {
		try(FileInputStream f=new FileInputStream("read1.txt"))
				{
					
				int av=f.available();
				//System.out.println(av);
					
					int read=f.read();
					while(read!=-1)
					{
					System.out.print((char)read);
					read=f.read();
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
