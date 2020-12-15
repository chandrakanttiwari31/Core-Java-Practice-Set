package constructor;

public class ParameterizedConst {

		int length;
		
		int breadth;
		public ParameterizedConst(int length,int breadth )
		{
			
			System.out.println("Parameter constructor");
		}
		public static void main(String[] args) {
			ParameterizedConst p=new ParameterizedConst(10,30);
		}
}
