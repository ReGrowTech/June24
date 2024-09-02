package array_shad;

public class Sum_Of_Array {

	public static void main(String[] args) {
		
//3.WAP to print the sum of array elements.
		
		int arr[] = {4, 6, 1, 3, 2, 7, 10, 2};
		int sum = 0;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			sum = sum + arr[i];
		}
		
		System.out.println("Sum of given array is : " + sum);

	}

}
