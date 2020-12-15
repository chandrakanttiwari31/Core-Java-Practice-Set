package array;

import java.util.Scanner;

public class Divisible_Array {
	public static void main(String[] args) {
		
		int [] a=new int [5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your array element");
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]%5==0)
			{
				
				System.out.println("your divisible array  is ="+a[i]);
			}
		}
	}

}
