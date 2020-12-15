package string;

public class rev_string_usingAPI {

	public static String rev(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	public static void main(String[] args) {
		String s = "Coder Technologies vashi";
		s = rev(s);
		System.out.println("Result after reversing a string is : " + s);
	}
}
