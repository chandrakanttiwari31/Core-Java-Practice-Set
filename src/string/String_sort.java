package string;

public class String_sort {

	
	public static void main(String[] args) 
	{
		String s = "Hello World";
		char ar[] = s.toCharArray();
		char temp;
		for(int i =0;i<ar.length;i++)
		{
			for (int j=0;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
			
		
		for (int i =0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
				
	}

}
