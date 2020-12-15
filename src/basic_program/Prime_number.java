package basic_program;

public class Prime_number {

	public static void main(String[] args) {
		int num=4;
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
			
			if(num%i==0)
				
			{
				flag=true;
				break;
			}
			
		}
		if(flag==false)
		{
			
			System.out.println("number is prime number");
		}
		
		else
		{
			
			System.out.println("number is not prime number");
		}
	}
}
