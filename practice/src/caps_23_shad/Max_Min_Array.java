package caps_23_shad;

public class Max_Min_Array {

	public static void main(String[] args) {
		
//1. WAP to find the Maximum & Minimum Numbers in an Array.
		
		int arr[] = {56, 86, 11, 32, 13, 29, 70, 13, 10, 21};
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		
		System.out.println("Maximum value is : " + max);
		System.out.println("Minimum value is : " + min);


	}

}
