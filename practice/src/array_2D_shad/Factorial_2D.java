package array_2D_shad;

public class Factorial_2D {

	public static void main(String[] args) {
		
//4.WAP to store first 5 Factorial in an array and print.
		
		int arr[][] = {{3, 7, 8, 9}, {2, 6, 1, 4 }};
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				int fact = 1 ;
				
				for(int x = 1 ; x <= arr[i][j] ; x++)
				{
					fact = fact * x;
				}
				
				System.out.println("Factorial of " + arr[i][j] + " is : " + fact  );
			}
			
			System.out.println();
		}
	}

}
