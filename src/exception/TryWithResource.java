package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResource {



	public static void main(String[] args) throws IOException {
		
		
	try(FileInputStream f=new FileInputStream("abc.txt"))
	{
	 
	}
	
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	
	System.out.println("This My main class");
}
}

