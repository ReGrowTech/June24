package caps_25_shad;
import java.util.*;

public class Printing_2X3_Matrix {

	public static void main(String[] args) {
		
//1. WAP to Declare 2X3 dynamic array and print it in matrix form.
		
		Scanner sc = new Scanner(System.in);
		
		int arr [][] = new int[2][3];
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				System.out.println("Enter the value");
				
				arr[i][j] = sc.nextInt();
			}
		}
		
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
