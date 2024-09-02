package array_shad;

public class Even_Elements_Array {

	public static void main (String [] args) {
		
//7.WAP to print all the even numbers in an array?

		int arr[] = {2, 5, 3, 12, 8, 9, 58, 7};
		
		System.out.println("The even elements are ");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println(arr[i]);
			}
			
		}

	}
}
