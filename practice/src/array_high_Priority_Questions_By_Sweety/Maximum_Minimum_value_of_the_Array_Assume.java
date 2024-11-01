package array_high_Priority_Questions_By_Sweety;

public class Maximum_Minimum_value_of_the_Array_Assume {

	public static void main(String[] args) 
	{
		
		int a[]= {5,9,7,36,75,3,9,90,40,37,98,40,52};
		
		int max=a[0];
		int min= a[0];
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
        	System.out.println("Maximum "+max);
		    System.out.println("Minimun "+min);
		    System.out.println("Yes i did it ");

	}

}
