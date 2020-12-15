package constructor;

public class ConstOverloading {

	int length;
	
	int breadth;
	
	public ConstOverloading()
	{
		
		length=10;
		breadth=20;
	}
	public ConstOverloading(int length,int breadth )
	{
		
		this.length=length;
		this.breadth=breadth;
	}
	
	public static void main(String[] args) {
		
	ConstOverloading c=new ConstOverloading();
	
	ConstOverloading c1=new ConstOverloading(40,50);
	
	System.out.println("object c="+c.length+" "+c.breadth);
	System.out.println("object c1="+c1.length+" "+c1.breadth);
	
	}
	
}
