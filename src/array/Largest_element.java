package array;

public class Largest_element {

	public static void main(String[] args) {
		int a[]= {2,4,3,6,5,8,7,9,10,33,22,12,32};
		
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
	
}
