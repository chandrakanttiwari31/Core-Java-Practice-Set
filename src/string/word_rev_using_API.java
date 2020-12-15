package string;

public class word_rev_using_API {

	public String reverseWords(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}

		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; --i) {
			if (!arr[i].equals("")) {
				sb.append(arr[i]).append(" ");
			}
		}
		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
	}

	public static void main(String[] args) {

		word_rev_using_API revv = new word_rev_using_API();
		revv.reverseWords("Coder Technologies vashi");
	}
}
