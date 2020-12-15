package string;

import java.util.Scanner;

public class Test {
	public static void main(String[] args)
	 {
	    String gender;
	    Scanner scan = new Scanner(System.in);

	    System.out.println("What is your gender, male or female?");
	    gender = scan.nextLine();


	    if( gender.equals("f")||gender.equals("F")||gender.equals 
	       ("female")||gender.equals("Female")||gender.equals("FEMALE"))
	    {
	       System.out.println("A female" );
	    }

	    if( gender.equals("m")||gender.equals("M")||gender.equals         
	        ("male")||gender.equals("Male")||gender.equals("MALE"))
	    {
	       System.out.println("A male.");
	    }

	 }
}