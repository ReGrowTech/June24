package functions_shad;
import java.util.*;

public class NXN_Prime_Numbers {

//5. WAP to print all the Prime Numbers in an N X N Matrix. using functions.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the number of rows ");
		int r = sc.nextInt();
		
		System.out.println("Enter the number of columns ");
		int c = sc.nextInt();
		
		int arr[][] = new int[r][c];
		
		for(int i = 0 ; i < arr.length ; i++)
		{	
			System.out.println("Enter the values");
			
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Prime numbers are ");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				int n = arr[i][j];
				
				Prime_Number_Code.Prime_Code(n);
			}
		}
		

	}
	
}


