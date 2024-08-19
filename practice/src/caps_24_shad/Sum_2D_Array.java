package caps_24_shad;

public class Sum_2D_Array {

	public static void main(String[] args) {
		
//2. WAP to print the sum of all elements in an 2D Array. 
		

		int arr[][] = { {2,3}, {8,1}, {5,2}, {7,3} };
		int sum = 0;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				sum += arr[i][j];
			}
		}
		
		System.out.println("The sum of given 2D array is : " + sum);
	}

}
