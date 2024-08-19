package unit_test_08_shad;

public class Diagonal_Elements {

	public static void main(String[] args) {
		
//Q12.WAP to print all the diagonal numbers in an array.
		
		int arr[][] = { {8, 7, 8, 9}, {0, 3, 6, 4}, {5, 1, 9, 2}, {11, 6, 9, 4} };
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println(arr[i][j]);
				}
			}
		}
		

	}

}
