package array_high_Priority_Questions_By_Sweety;

public class Nth_highest_Value_and_the_lowest_Value_in_the_Array {

	public static void main(String[] args) {
		
		int arr[]= {5,9,7,36,75,3,9,90,40,37,98,40,52};
		
		int lowest= 3;
		int highest =4;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
			
				if (arr[i]>arr[j])
				{
					int temp= arr[i] ;
					arr[i]=arr[j];
					arr[j]=temp ;
					
					
				}
			}
		}
		for(int each: arr)
		{
			System.out.print(each+" ");
	
		}
		System.out.println("\n");
		
		System.out.println(arr[arr.length-highest]+" is the [ "+ highest +" ] Heighest value ");
		
		System.out.println(arr[lowest]+ "is the [ "+ lowest +"]  Lowest value ");
		System.out.println("Yes i did this");

	}

}
