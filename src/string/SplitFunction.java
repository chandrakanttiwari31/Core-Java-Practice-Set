package string;

public class SplitFunction {

	public static void main(String[] args) {
		
		
		String s = "Squad Infotech Nerul";
		String[] arr = s.split(" ");    

		for ( String ss : arr) {
		    System.out.println(ss);
		}
	}
}
