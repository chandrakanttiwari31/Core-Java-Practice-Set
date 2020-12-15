package javaPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class deserializationdemo {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
	InputStream in=new FileInputStream("chandan.txt");
	ObjectInputStream o=new ObjectInputStream(in);
	Employee e=(Employee) o.readObject();
	System.out.println(e);
}
}
