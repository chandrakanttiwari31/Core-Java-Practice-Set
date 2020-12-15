package basic_program;

public class Swaping {
public static void main(String[] args) {
	
	int a=2;
	int b=3;
	System.out.println(a);
	System.out.println(b);
	
	System.out.println("**********");
	//System.out.println("After swaping ");
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swaping a is="+a+"b is="+b);
}
}
