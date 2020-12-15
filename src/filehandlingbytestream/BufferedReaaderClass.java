package filehandlingbytestream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaaderClass {

	
	public static void main(String[] args) throws IOException {
		
		int ch;
		BufferedReader br=new BufferedReader(new FileReader("javaa.txt"));
		
		
		
		while((ch=br.read())!=-1)
		{
			
			System.out.print((char)ch);
		}
		
		br.close();
	}
}
