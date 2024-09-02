package array_shad;

public class Greatest_Using_Sorting {

	public static void main(String[] args) {
		
//5. WAP to find the greatest value in an array using sorting technique.
		
		int arr[] = {5, 6, 11, 32, 13, 29, 7, 13, 10, 2};
		int temp;
		
		for(int i = 0 ; i < arr.length ; i++)
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
		
		System.out.println("Greatest value is : " + arr[arr.length - 1]);
		

	}

}
