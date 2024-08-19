package unit_test_08_shad;
import java.util.*;

public class Even_Array_UserInput {

	public static void main(String[] args) {
		
//Q6. WAP to print all the even numbers in an array. Take User Input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the value");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("Even numbers are ");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}

}
