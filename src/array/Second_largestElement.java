package array;

public class Second_largestElement {
	
	
	public static void main(String[] args) {
		int temp;
		int a[]= {2,4,6,7,3,8,5};
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]<a[j])
				{
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			
		}
		System.out.println("Second largest Element is="+a[1]);
		
		
	}

}
