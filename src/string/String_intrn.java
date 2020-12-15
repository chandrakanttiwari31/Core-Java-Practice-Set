package string;

public class String_intrn {

	public static void main(String args[]) {
		String str1 = "Coder Technology";
		String str2 = new String("Coder Technology");
		String str3 = str2.intern();
		System.out.println(str1 == str2);// false because reference variables are pointing to different instance
		System.out.println(str1 == str3);// true because reference variables are pointing to same instance
	}
}
