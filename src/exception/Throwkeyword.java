package exception;

public class Throwkeyword {

	int a;
	public void show(int a)
	{
		//System.out.println("hello");
		if(a>18)
			
		{
			System.out.println("u r eligible");

		}
		else
			throw new ArithmeticException("you a not eligible for vote");

	}
	public static void main(String[] args) {
		
		
		Throwkeyword t=new Throwkeyword();
		t.show(20);
		System.out.println("welcom");
	}
}
