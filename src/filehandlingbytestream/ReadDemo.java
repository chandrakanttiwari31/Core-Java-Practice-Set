package filehandlingbytestream;

import java.io.File;
import java.io.IOException;

public class ReadDemo {
	public static void main(String[] args) throws IOException {
		
		File f=new  File("hello.txt");
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println(f.length());
	}

}
