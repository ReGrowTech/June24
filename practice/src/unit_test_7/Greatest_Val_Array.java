package unit_test_7;

public class Greatest_Val_Array {

	public static void main(String[] args) {
		
//Q14.WAP in Java to Find the Greatest Number in an Array.
		
		int arr[] = {10, 42, 38, 77, 25, 100, 65};
		int great = arr[0];
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] > great)
			{
				great = arr[i];
			}
		}
		
		System.out.println("The greatest value is : " + great);

	}

}
