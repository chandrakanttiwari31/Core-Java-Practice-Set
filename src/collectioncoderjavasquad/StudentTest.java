package collectioncoderjavasquad;

import java.util.ArrayList;

public class StudentTest {

	
	public static void main(String[] args) {
		Strudent s1=new Strudent(1,"chandan");
		Strudent s2=new Strudent(2,"tiwari");
		Strudent s3=new Strudent(3,"java");
		ArrayList<Strudent> list=new ArrayList();
		
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
		
	}
}
