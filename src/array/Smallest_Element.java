package array;

public class Smallest_Element {

	
	public static void main(String[] args) {
		int a[]= {2,4,3,6,5,8,7,9,10,33,22,12,32};
		
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}
}
