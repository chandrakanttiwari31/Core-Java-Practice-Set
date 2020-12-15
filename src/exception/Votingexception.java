package exception;

import java.util.Scanner;

public class Votingexception {

	

	
	Scanner sc=new Scanner(System.in);
	int age=18;
	int age1=0;
	public void vote()
	{
		System.out.println("Enter your age");
		age1=sc.nextInt();
		
		if(age>age1)
		{
                try
                {
 			throw new AgeNotValid();
		}
                catch(AgeNotValid e)
                {
                	
                	e.printStackTrace();
                }
		}
		else
		{
			System.out.println("you are eligible for voting");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Votingexception v=new Votingexception();
		v.vote();
		
	}

}



class AgeNotValid extends Exception
{
  public String tostring()
  {
	   return "AgeValidException";
	  
  }
}
