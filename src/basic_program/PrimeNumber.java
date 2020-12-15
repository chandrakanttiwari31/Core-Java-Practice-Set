package basic_program;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
//	int no=7;
//	int temp=0;
//	for(int i=2;i<=no-1;i++)
//	{
//		
//		if(no%i==0)
//		{
//			
//			temp=temp+1;
//		}
//	}
//	
//	if(temp>0)
//	{
//		
//		System.out.println("not prime");
//	}
//	else
//	{
//		
//		System.out.println("prime number");
//	}
//	
	
	
	int i;
	boolean flag=false;
	Scanner cs=new Scanner(System.in);
	System.out.println("enter your no");
	
	int num=cs.nextInt();
	
	for(i=2;i<=num/2;i++)
	{
		
		if(num%i==0)
		{
			flag=true;
			break;
			
			
		}
	}
	if(flag==false)
		System.out.println("number is prime");
	else
		System.out.println("number is not prime");
	
	
}
}
