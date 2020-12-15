package array;

import java.util.Scanner;

public class DeleteFrom_Array {

	public static void main(String args[])
	{
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your  array no");
		
	     int[] a= new int[5];
	     for(int i=0;i<a.length;i++)
	     {
	    	 a[i]=sc.nextInt();
	    	 
	     }
	     
	     
	     System.out.println("Enter your number which you want to delete");
	     
	      int a1;
	    a1 =sc.nextInt();
	   
	     for(int i=0;i<a.length;i++)
	     {
	    	 if(a[i]==a1)
	    	 {
	    		 System.out.println(a[i]-a1);
	    	
	    	} 
	    	 else
		    	 System.out.println(a[i]);
	     
	     
	     }
	     
	}


}
