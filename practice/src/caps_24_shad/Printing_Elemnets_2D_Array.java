package caps_24_shad;

public class Printing_Elemnets_2D_Array {

	public static void main(String[] args) {
		
//1. WAP to print all the element in the 2D Array.
		
		int arr[][] = { {2,3}, {8,1}, {5,2}, {7,3} };
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
