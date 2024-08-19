package caps_21_shad;
import java.util.*;

public class User_Input_Dynamic_Array {

	public static void main(String[] args) {
		
//4. WAP to Create a Dynamic Array and take User Input. 
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		System.out.println("Enter the 5 values");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = sc.nextInt();
			
		}

		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
