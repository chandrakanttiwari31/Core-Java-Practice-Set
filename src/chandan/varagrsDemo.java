package chandan;

public class varagrsDemo {

	
	public static void main(String[] args) {
		Abc obj=new Abc();
		obj.display(1,2,3);
	}
}

class Abc
{
   public void display(int ...a)
   {
	   
	   for(int i:a)
	   {
		   
		   System.out.println(i);
	   }
   }
   
}