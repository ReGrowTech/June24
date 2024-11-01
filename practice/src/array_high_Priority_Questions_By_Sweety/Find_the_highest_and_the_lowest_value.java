package array_high_Priority_Questions_By_Sweety;

public class Find_the_highest_and_the_lowest_value {

	public static void main(String[] args) 
	{
     
		int a[]= {5,9,7,36,75,3,9,90,40,37,98,40,52};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j]) 
				{
				     int temp = a[i];
				     a[i]= a[j];
				     a[j]= temp ;
				}
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Heighest val : "+ a[a.length-1]);
		System.out.println("Lowest val  : "+ a[0]);
		System.out.println("Yes i did it ");


	}

}
