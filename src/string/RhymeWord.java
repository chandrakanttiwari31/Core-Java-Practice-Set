package string;

public class RhymeWord {
public static void main(String[] args) {
	
	String s ="I got the job Then I saw the pot in window He love me a lot. Forget me not";
	String ar[]=s.split(" ");
	for(int i=0;i<ar.length;i++)
	{
		
		boolean res=ar[i].endsWith("ot");
		if(res==true)
		{
			
			System.out.println(ar[i]);
		}
				
	}
	
}
}
