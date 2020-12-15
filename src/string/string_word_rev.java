package string;

public class string_word_rev {

	   public static void main(String[] args) 
	    { 
	        String s[] = "Coder Technologies vashi".split(" "); 
	        String ans = ""; 
	        for (int i = s.length - 1; i >= 0; i--) { 
	            ans += s[i] + " "; 
	        } 
	       System.out.println("Reversed String:");
	       System.out.println(ans);
	    }
}
