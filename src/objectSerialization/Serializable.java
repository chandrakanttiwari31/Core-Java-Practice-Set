package objectSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Serializable {

	
	public static void main(String[] args) {
		try
		{
			
			Employee e=new Employee(101,"Rakesh",10000);
			Employee e1=new Employee(1012,"Rohan",20000);
			
			OutputStream os=new FileOutputStream("emp1.txt");
			ObjectOutputStream oos=new ObjectOutputStream(os);
			oos.writeObject(e);
			oos.writeObject(e1);
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
