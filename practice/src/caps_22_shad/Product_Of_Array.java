package caps_22_shad;

public class Product_Of_Array {

	public static void main(String[] args) {
		
//4. WAP to find the product of array.
		
		int arr[] = {4, 6, 1, 3, 2};
		int pro = 1;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			pro = pro * arr[i];
		}
		
		System.out.println("Product of given array is : " + pro);

	}

}
