package basic_program;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		int rem,num,temp;
		int rev=0;
		Scanner sc=new Scanner(System.in);;
		System.out.println("Enter your number");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		if(temp==rev)
		{
			
			System.out.println("number is palindrom");
		}
		else
		{
			
			System.out.println("number is not palindrom");
		}
		
	}
}
