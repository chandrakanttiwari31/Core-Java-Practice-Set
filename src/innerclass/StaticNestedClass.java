package innerclass;

public class StaticNestedClass {

	
	int num=10;
	static class InnerStatic
	{
		int val=20;
		public void show()
		{
			
			System.out.println("hello");
			
			StaticNestedClass so=new StaticNestedClass();
			System.out.println(so.num);
		}
		
	}
	
	public static void main(String[] args) {
		//StaticOuter s=new StaticOuter();
		//System.out.println(s.num);
		
		
		
		StaticNestedClass.InnerStatic i=new StaticNestedClass.InnerStatic(); //inner class object
		i.show();
		System.out.println(i.val);
	}
}
