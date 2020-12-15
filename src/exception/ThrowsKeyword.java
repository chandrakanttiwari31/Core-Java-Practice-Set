package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {
	
	

		
		public void show() throws FileNotFoundException
		{
			
			FileInputStream f=new FileInputStream("abc.txt");
		}
		
		public void read() throws FileNotFoundException
		{
			
			show();
		}
		
		
		public static void main(String[] args) {
			ThrowsKeyword t=new ThrowsKeyword();
			
			try {
				t.read();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("welcom");
		}



}
