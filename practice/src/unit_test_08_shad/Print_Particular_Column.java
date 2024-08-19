package unit_test_08_shad;
import java.util.*;

public class Print_Particular_Column {

	public static void main(String[] args) {
		
//Q14.WAP to declare NXN matrix and print the 3rd column.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows : ");
		int r = sc.nextInt();
		
		System.out.println("Enter the number of columns : ");
		int c = sc.nextInt();
		
		int arr[][] = new int[r][c];
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.println("Enter the value");
		
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("3rd column is ");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.println(arr[i][2]);
		}
		
		
	}

}
