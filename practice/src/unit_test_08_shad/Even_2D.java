package unit_test_08_shad;

public class Even_2D {

	public static void main(String[] args) {
		
//Q11.WAP to print all the even numbers present in 2D array.
		
		int arr[][] = { {8, 7, 8, 9}, {0, 3, 6, 4}, {5, 1, 10, 2} };
		
		System.out.println("Even numbers are");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				if(arr[i][j] % 2 == 0)
				{
					System.out.print(arr[i][j] + " ");
				}
			}
		}
	}

}
