package unit_test_08_shad;

public class First_Five_Factorial {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = i + 1;
		}
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			int fact = 1;
			
			for(int x = 1 ; x <= arr[i] ; x++)
			{
				fact = fact * x;
			}
			
			System.out.println("Factorial of " + arr[i] + " is : " + fact);
		}
		
	}

}
