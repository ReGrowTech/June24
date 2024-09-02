package array_shad;

public class Printing_Num_DyArr {

	public static void main(String[] args) {
		
//2. WAP to create a Dynamic Array and print 1-5.
		
		int arr[] = new int[5];
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = i + 1;
		}
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
