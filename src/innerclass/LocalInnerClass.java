package innerclass;

public class LocalInnerClass {

	

	public void show()
	{
		
		System.out.println("hello");
		
		class innerclass
		{
			
			public void dispaly()
			{
				
				System.out.println("Inner class method");
			}
		}
		
		innerclass i=new innerclass();
		i.dispaly();
		System.out.println("outer method");
	}
	public static void main(String[] args) {
		
	
		LocalInnerClass o=new LocalInnerClass();
	o.show();
	
	}
}
