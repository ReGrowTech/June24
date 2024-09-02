package array_shad;

public class Min_Value {

	public static void main(String[] args) {
		
//3. WAP to find the Minimum value in an Array.
		
		int arr[] = {15, 26, 11, 32, 13, 29, 7, 13, 10, 22};
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
		
		System.out.println("Minimum value is : " + arr[0]);

	}

}
