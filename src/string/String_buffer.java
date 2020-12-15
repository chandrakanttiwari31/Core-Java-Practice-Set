package string;

public class String_buffer {
	
	public static void main(String[] args) {
		
		StringBuffer  sb=new StringBuffer("Java Programming");
		
		System.out.println("Length Method="+sb.length());
		System.out.println("Capacity="+sb.capacity());
		
		System.out.println("Append="+sb.append("language"));
		
		System.out.println("Replace ="+sb.replace(17, 24,"LANGUAGE"));
		
		System.out.println("Reverse method="+sb.reverse());
		
		System.out.println(sb.chars());
		
		
		System.out.println(sb.charAt(2));
	}

}
