package array_2D_shad;

public class Printing_2nd_Column {

	public static void main(String[] args) {
		
//2. WAP to declare N X N matrix and print the 2nd column.
		
		int arr[][] = {{8, 7, 8, 9}, {0, 3, 1, 4 }, {19, 5, 3, 2}, {10, 1, 6, 11}};
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			//System.out.println(arr[i][1]);
			
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				if(j == 1) 
				{
					System.out.println(arr[i][j]);
				}
				
			}
				
		}

	}

}
