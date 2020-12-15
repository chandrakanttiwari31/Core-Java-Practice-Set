package filehandling;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterclass {

	
	public static void main(String[] args) {
		String s1="coder thane";
		String s2="Squad info";
		String name="chandan";
		int age=23;
		try
		{
			File f=new File("printwriter.txt");
			PrintWriter pw=new PrintWriter(f);///this is use for write in file
			PrintWriter pw1=new PrintWriter(System.out);////this is use for write in console
			pw.println(s1);
		//	pw.flush();
			pw.append(s2);
		//	pw.flush();
			pw.printf("\n");
//			pw.printf("my name is %s,age %d",name,age);
//			pw.close();
//			
			
		pw1.printf("my name is %s,age %d",name,age);
			pw1.close();
//			
			
			
		}catch(IOException e)
		{
			
			e.printStackTrace();
		}
				
		}
	}

