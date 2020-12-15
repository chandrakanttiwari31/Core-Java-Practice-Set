package string;

import java.util.Scanner;

public class String_palindrom {

	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String rev = "";
	String temp = s;

	public void show() {

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		if (rev.equals(temp)) {
			System.out.println("Palindrome True");
		} else {
			System.out.println("Palindrome False");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		String_palindrom r = new String_palindrom();
		r.show();
	}
}
