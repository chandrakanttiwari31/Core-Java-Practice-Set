package exception;

import java.util.Scanner;

public class ExceptionDemo {
	 Scanner sc=new Scanner(System.in);
	 int bal=5000;
	 int amt=0;
	 
	 
	 public void withdraw()

	{
	  System.out.println("Enter Amount");
	  amt=sc.nextInt();
	  
	  if(amt>bal)
	  {
		  
		  try
		  {
		  throw new FunInsufficientException();
		  }
		  catch(FunInsufficientException e)
		  {
			  
			  e.printStackTrace();
		  }
	  }
	  else
	  {
		  
		  bal=bal-amt;
		  System.out.println("your balance is ;"+bal);
	  }
	}
	 
	 
	 public static void main(String[] args) {
		 
		 ExceptionDemo b=new ExceptionDemo();
		 b.withdraw();
		
	}
	 
}
