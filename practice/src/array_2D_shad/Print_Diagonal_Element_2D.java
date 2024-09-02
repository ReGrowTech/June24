package array_2D_shad;

public class Print_Diagonal_Element_2D {

	public static void main(String[] args) {
		
//5. WAP to print all the diagonal numbers in array.
		
		int arr[][] = {{8, 7, 8, 9}, {0, 3, 1, 4 }, {19, 3, 5, 2}, {10, 1, 6, 11}};
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[i][j] + " ");
				}
				
				else
				{
					System.out.print(" " + " " );
				}
			}
			
			System.out.println();
		}

	}

}
