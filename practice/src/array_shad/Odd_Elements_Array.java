package array_shad;

public class Odd_Elements_Array {

	public static void main(String[] args) {
		
//8. WAP to print all the odd numbers in an array?
		
		int arr[] = {2, 5, 3, 9, 8, 9, 5, 7, 0, 6};
		
		System.out.println("The odd elements are ");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] % 2 != 0)
			{
				System.out.println(arr[i]);
			}
			
		}

	}

}
