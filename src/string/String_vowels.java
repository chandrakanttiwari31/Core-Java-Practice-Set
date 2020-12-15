package string;

public class String_vowels {

	
	public static void main(String[] args) 
	{
		String s= "India is my country. I love my country ";
		char arr[] = {'A','E','O','U','I','a','e','o','u','i'};
		System.out.println(s);
		
		for(int i =0;i<arr.length;i++)
		{
			for(int j=0;j<s.length();j++) 
			{
				if (arr[i]==s.charAt(j))
				{
					System.out.print(s.charAt(j));
					break;
				}
			}
		}
	}
}
