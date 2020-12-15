package javaPractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class serializationdemo {

	public static void main(String[] args) {
		try
		{
		Employee  e=new Employee(1,"Chandan",100000);
		OutputStream  os=new FileOutputStream("chandan.txt");
		ObjectOutputStream oss=new ObjectOutputStream(os);
		
		oss.writeObject(e);
	}
		catch(FileNotFoundException e2)
		{
			e2.printStackTrace();
			
		}
		catch(IOException e2)
		{
			e2.printStackTrace();
		}
	}
}
