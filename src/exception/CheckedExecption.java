package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExecption {

	

public static void main(String[] args) {
	
	try
	{
	 FileInputStream f=new FileInputStream("abc.txt");
}
	
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	
	System.out.println("This My main class");
}
}
