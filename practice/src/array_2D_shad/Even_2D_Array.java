package array_2D_shad;

public class Even_2D_Array {

	public static void main(String[] args) {
		
//3. WAP to Print all the even numbers present in the 2D array.
		

		int arr[][] = { {2,3}, {8,1}, {5,2}, {7,3}, {10, 17} };
		
		System.out.println("Even numbers in a 2D array are ");
		
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
