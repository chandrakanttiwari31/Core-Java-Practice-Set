package innerclass;

public class RagularInnerClass {
	
	
	int num=10;
	 class RagularInner
	{
		int val=20;
		public void show()
		{
			
			System.out.println("hello");

			
			System.out.println(num);
		}
		
	}
	
	public static void main(String[] args) {

		RagularInnerClass s=new RagularInnerClass();
//		System.out.println(s.num);
		
		
		
		RagularInnerClass.RagularInner i=s.new RagularInner();
		i.show();
		System.out.println(i.val);
	}


}
