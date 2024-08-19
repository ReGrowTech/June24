package caps_23_shad;

public class Sorting_Desc {

	public static void main(String[] args) {
		
//2. WAP to arrange the array in Descending order. 
		
		int arr[] = {56, 36, 11, 32, 13, 29, 70, 13, 10, 21};
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
