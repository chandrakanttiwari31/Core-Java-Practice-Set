package abstractmethod;

public class AbstractDemo {


public static void main(String[] args) {
	Nmobile n=new Nmobile(5);
	n.calling();
	n.msg();
	n.camera();
	n.show();
	
	
	
}
}

abstract class mobile
{
	
	int n;
	mobile(int n)
	{
		
		this.n=n;
	}
	
public void calling()
{
  System.out.println("calling method");	
}

public void msg()
{
System.out.println("messaging method");	

}

abstract public void camera();
}



class Nmobile extends mobile
{
	
	Nmobile(int n)
	{
		
		super(n);
	}
	
	public void show()
	{
		
		System.out.println(n);
	}
  public void camera()
  {
	  
	  System.out.println("Camera Method");
  }

	
}
