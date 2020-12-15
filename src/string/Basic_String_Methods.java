package string;

public class Basic_String_Methods {

	
	
	public static void main(String[] args) {
		
		System.out.println("Here is == method");
		String s1=new String("java");
		String s2="java";
		
		System.out.println(s1==s2);//  == method is use to check the memory location of both obeject  
		                           //if both obeject are in same memory then it return  true other false
		
		
		
		String s3="Amit";
		String s4="Amit";
		System.out.println(s3==s4);
		
		
		System.out.println("Here is equalto method");
		String s5=new String("Rohan");
		String s6="Rohan";
		System.out.println(s5.equals(s6)); // .equals method is use to comapar the value of object 
		                                   //if both are same then it return ttrue oyterwise false
		System.out.println(s5.equalsIgnoreCase(s6));
		
		System.out.println("Here is Compareto method");
		String s7="java";
		String s8=new String("Java");
		System.out.println(s7.compareTo(s8));  //compare to method is use to compare the ASCII value of both object
		System.out.println(s7.compareToIgnoreCase(s8));										// and it return the output in the form of integer
		
		
		
		
		System.out.println("String Concate Method");
		
		System.out.println(s8.concat("programming"));
		
		
		System.out.println("String Join Method");
		System.out.println(String.join(",",s7,s8));
		
		
		
		
		
		System.out.println("String subSequence method");
		String s9="oops is a heart of programming";
		System.out.println(s9.subSequence(3, 9));
		
		
		System.out.println("String SuString method");;
		String s10="milk is good for helth";
		System.out.println(s10.substring(4));
		System.out.println(s10.substring(4, 9));
		
		
		
		System.out.println("String Lenght method");
	    String s11=new String("   India is my country   ");
	    System.out.println(s11.length());
	    
	    
	    System.out.println("String IsEmpty method");

	    System.out.println(s11.isEmpty());;
	    
	    System.out.println("String trim method");
	    System.out.println(s11.trim());
	    
	    
	    
	    System.out.println("String Update or replace method");
	    
	    String s12="python programming";
	    System.out.println(s12);
	    System.out.println(s12.replace("python", "java"));
	    
	    System.out.println("Strinng replac all method");
	    String s13="this is my  dog";
	    System.out.println(s13);
	    System.out.println(s13.replaceAll("is","was"));
	    
	    
	    System.out.println("String replace first method");
	    System.out.println(s13);
	    System.out.println(s13.replaceFirst("is","was"));
	    
	    System.out.println("String searching method");
	    
	    String s14="coder technology";
	    System.out.println(s14);
	    System.out.println("index of method="+s14.indexOf("d"));
	    
	    System.out.println("last index="+s14.lastIndexOf("o"));
	    
	    System.out.println("contains method="+s14.contains("d"));
	    
	    System.out.println("char at method="+s14.charAt(4));
	    
	    System.out.println("Strat with method="+s14.startsWith("c"));
	    System.out.println("Ends with method="+s14.endsWith("y"));
	    
	    System.out.println("To upper case method="+s14.toUpperCase());
	    
	    System.out.println("to lower case="+s14.toLowerCase());
	    
	    System.out.println("to char array method="+s14.toCharArray());
	}
}
