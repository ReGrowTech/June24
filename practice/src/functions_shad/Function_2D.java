package functions_shad;

public class Function_2D {

//4.WAP in java using Functions and print all the even numbers in a 2D array.
	
	public static void main(String[] args) {
		
		int arr[][] = { {11, 41, 12}, {13, 51, 28}, {17, 10, 22} };
		
		System.out.println("Even numbers are");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				Function_Even_Code_1.Code_Even(arr[i][j]);
			}
		}
	
	}

}
