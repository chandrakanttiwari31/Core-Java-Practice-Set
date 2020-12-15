package array;

import java.util.Scanner;

public class EvenArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your array element");;
		int []a=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
				
			}
			
		}
				
				
	}
}
