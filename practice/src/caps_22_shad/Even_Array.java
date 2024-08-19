package caps_22_shad;

public class Even_Array {

	public static void main(String[] args) {
		
//1. WAP to Print all the even numbers in an array.
		
		int arr[] = {4, 6, 1, 32, 29, 7, 13, 10, 2};
		
		System.out.println("Even numbers are \n");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}

}
