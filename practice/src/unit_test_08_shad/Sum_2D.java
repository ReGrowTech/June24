package unit_test_08_shad;

public class Sum_2D {

	public static void main(String[] args) {
		
//Q10.WAP to print the sum of all the elements in 2D array.
		
		int arr[][] = { {8, 7, 8, 9}, {0, 3, 6, 4}, {5, 1, 10, 2} };
		int sum = 0;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				sum = sum + arr[i][j];
			} 
		}
		System.out.println("Sum of all the elements : " + sum);
		

	}

}
