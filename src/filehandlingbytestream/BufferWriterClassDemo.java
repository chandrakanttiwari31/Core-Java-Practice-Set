package filehandlingbytestream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterClassDemo {
public static void main(String[] args) throws IOException {
	
	BufferedWriter bf=new BufferedWriter(new FileWriter("javaa.txt",true));
	bf.write("high Performance");
	bf.close();
}
}
