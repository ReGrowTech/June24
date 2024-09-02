package functions_shad;

//Q1. Create a non-static function and declare 3X2 static array & print all the odd numbers. Call the function
//		in the main method.

public class Odd_Array_Function {

	public static void main(String[] args) {
		
		Odd_Array_Function obj = new Odd_Array_Function();
		obj.Array();	
	}
	
	
	public void Array()
	{
		int arr[][] = { {2, 1}, {3, 4}, {5, 6}, {11, 9} };
		
		System.out.println("Odd numbers are");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				
				Odd_Array_Function obj = new Odd_Array_Function();
				obj.Code(arr[i][j]);
			}
		}
	}
	
	
	public void Code(int n)
	{
		if(n % 2 != 0)
		{
			System.out.println(n);
		}
	}

}
