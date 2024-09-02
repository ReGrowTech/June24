package array_2D_shad;

public class Odd_2D_Matrix {

	public static void main(String[] args) {
		
//3. WAP to declare 3X4 Static array and print all the Odd Numbers 
		
		int arr[][] = {{8, 7, 8, 9}, {0, 3, 1, 4 }, {10, 1, 6, 11}};
		
		System.out.println("Odd numbers are");
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				if(arr[i][j] % 2 != 0)
				{
					System.out.print(arr[i][j] + " ");
				}	
			}
			
		}
	}

}
