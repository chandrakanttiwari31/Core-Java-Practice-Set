package objectSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	
	
	public static void main(String[] args) {
		InputStream read;
		try
		{
			read=new FileInputStream("emp1.txt");
			ObjectInputStream os=new ObjectInputStream(read);
			
			Employee ee=(Employee)os.readObject();
			//Employee eee=(Employee)os.readObject();
			
			System.out.println(ee);
			//System.out.println(eee);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
