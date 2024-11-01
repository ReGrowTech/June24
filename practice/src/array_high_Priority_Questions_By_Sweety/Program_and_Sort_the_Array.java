package array_high_Priority_Questions_By_Sweety;

public class Program_and_Sort_the_Array {

	public static void main(String[] args) {
	
		int arr[]= {5,7,9,36,75,3,9,90,40,37,98,40,52};
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp ;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println(" yes i did it ");
	}

}
