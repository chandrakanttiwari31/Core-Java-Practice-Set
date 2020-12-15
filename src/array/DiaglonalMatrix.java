package array;

import java.util.Scanner;

public class DiaglonalMatrix {

	
	public static void main(String args[])
	{
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your  1st array");
			
			
			int[][] ar= new int[3][3];
			
			for(int i=0;i<ar.length;i++)
			{
				for(int j=0;j<ar.length;j++)
				{
					
					ar[i][j]=sc.nextInt();
				}
				
				
			}
			
			
			

		/*	for(int i=0;i<ar.length;i++)
			{
				for(int j=0;j<ar.length;j++)
				{
					
					System.out.println(ar[i][j]);
				}
				
				
			}
			*/
			
			
			
			
			for(int i=0;i<ar.length;i++)
			{
				for(int j=0;j<ar.length;j++)
				{
					  if(i==0 && j==0 ||i==1 && j==1 || i==2 && j==2)
						  
					  {
						  
						  System.out.print(0);
					  }
					  
					  else
						  System.out.print(ar[i][j]);
				}
				System.out.println( );
				}
					
			
		} 

}
