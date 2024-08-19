package unit_test_07_shad;
import java.util.*;

public class Even_Dynamic_Array {
	
	public static void main(String[] args) {

// Q10.WAP in Java take dynamic array and print all the even numbed in an array.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 5 value");
		int arr[] = new int [5];
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = sc.nextInt();		
		}
		
		System.out.println("The Even numbers are ");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			
			if(arr[i] % 2 == 0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		

		
		
	}
}
