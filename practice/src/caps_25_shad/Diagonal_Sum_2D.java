package caps_25_shad;

public class Diagonal_Sum_2D {

	public static void main(String[] args) {
		
//6. WAP to print the sum of all diagonal numbers in an array.
		
		int arr[][] = {{8, 7, 8, 9}, {0, 3, 1, 4 }, {19, 3, 5, 2}, {10, 1, 6, 11}};
		int sum = 0;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				if(arr[i] == arr[j])
				{
					sum = sum + arr[i][j];
				}
			}
		}
		System.out.println("Sum of diagonal elements : " + sum);

	}

}
