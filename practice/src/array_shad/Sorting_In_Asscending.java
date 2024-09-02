package array_shad;

public class Sorting_In_Asscending {

	public static void main(String[] args) {
		
//5. WAP to sort the values in ascending order in an array.
		
		int arr[] = {5, 2, 9, 7, 1};
		int temp;
		
		System.out.println("Before Sorting");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		for(int i = 0 ; i < arr.length ; i++)//for sorting
		{
			for(int j = i ; j < arr.length ; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;			
				}
			}
		}
		
		System.out.println();
		
		System.out.println("After Sorting");
		
		for(int i = 0 ; i < arr.length ; i++)//for printing
		{
			System.out.print(arr[i] + " ");
		}
		

	}

}
