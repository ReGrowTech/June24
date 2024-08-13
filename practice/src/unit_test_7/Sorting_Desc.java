package unit_test_7;

public class Sorting_Desc {

	public static void main(String[] args) {
		
//Q12.WAP to sort the Array in Descending order.
		
		int arr[] = {10, 42, 38, 77, 25, 100, 65};
		int temp;
		
		System.out.println("Before Sorting");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = i ; j < arr.length ; j++)
			{
				
				if(arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		System.out.println("After Sorting");
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
