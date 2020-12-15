package innerclass;

abstract class person
{
	public abstract void eat();
}


abstract class animals
{
public abstract void eat();

public abstract void jump();
}


public class AnonymousInnerClass extends person {
	
	public void eat()
	{
		System.out.println("person eat");
		
	}
	
		
	public static void main(String[] args) {
		
		AnonymousInnerClass n=new AnonymousInnerClass();
		n.eat();
	
	
	animals a=new animals()
			{
                  public void eat()
                  {
                	  
                  System.out.println("Animals eat");
                  
                  }
                  
                  
                  public void jump()
                  {
                	  
                	  System.out.println("Animals Jump");
                  }
                  };
                  
                  a.eat();
                  a.jump();
		
			}

}
