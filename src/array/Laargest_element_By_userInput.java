package array;

import java.util.Scanner;

public class Laargest_element_By_userInput {

	public static void main(String[] args) {
		
				int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ypur Element");
		
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
		}
		
		
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			
			if(a[i]>max)
			{
				
			max=a[i];
			}
		}
		
		
		System.out.println(max);

	}
}
