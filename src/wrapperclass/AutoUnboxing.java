package wrapperclass;

public class AutoUnboxing {

	public static void main(String[] args) {
		Integer i=new Integer(100);
		
		int x=i;  //Auto Unboxing
		System.out.println(x);
		
		
		int y=i.intValue();   /// Explicitly 0r Manual Unboxing
		System.out.println(y);  
				
	}
}
