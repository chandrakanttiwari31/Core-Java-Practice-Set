package array;

import java.util.Scanner;

public class ArrayUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] a=new  int[5];
		System.out.println("enter your element");
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
		}
		
		for(int  i=0;i<a.length;i++)
		{
			
			System.out.println("your  final element is="+a[i]);
		}
		
	}
}
