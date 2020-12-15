package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultipleCatchBlock {
	
	public static void main(String[] args) throws FileNotFoundException {
		int num=20;
		int res;
		try
		{res=num/0;
		 FileInputStream f=new FileInputStream("abc.txt");
		 
	}
		
		catch(FileNotFoundException e)
		{
			
			System.out.println("file not present");
		}
		catch(ArithmeticException e)
		{
			System.out.println("number is not divisible by 0");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
