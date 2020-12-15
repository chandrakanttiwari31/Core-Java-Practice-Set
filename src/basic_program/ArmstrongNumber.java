package basic_program;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153,rem,temp;
		int rev=0;
		temp=num;
		while(num>0)
		{
			
			rem=num%10;
			num=num/10;
			rev=rev+rem*rem*rem;
			
		}
		if(temp==rev)
		{
			
			System.out.println("num is armstrong");
		}
		else
		{
			
			System.out.println("number is not  armstrong");
		}
        
	}
}
