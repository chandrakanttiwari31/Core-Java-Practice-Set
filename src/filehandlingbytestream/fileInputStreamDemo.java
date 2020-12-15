package filehandlingbytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class fileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		int i;
		FileInputStream fis=new FileInputStream("javaa.txt");
		do {
			i=fis.read();
			if(i!=-1)
			{
				System.out.print((char)i);
			}
					
			
			
		}while(i!=-1);
		fis.close();
	}

}
