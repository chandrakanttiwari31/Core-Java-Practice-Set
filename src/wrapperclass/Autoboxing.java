package wrapperclass;

public class Autoboxing {
	
	public static void main(String[] args) {
		int num=100;
		
		
		Integer i=num;
		System.out.println(i);
		
		Integer x=Integer.valueOf(num);
		//System.out.println(num);
		System.out.println(x);
		
		
		Integer n=new Integer(num);
		System.out.println(n);
		
	}

}
