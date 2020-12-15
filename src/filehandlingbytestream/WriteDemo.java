package filehandlingbytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDemo {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream ff=new FileOutputStream("javaa.txt",true);
		String s="java programming";
		
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			ff.write(ch[i]);
			
		}
		ff.close();
		
		
	}

}
