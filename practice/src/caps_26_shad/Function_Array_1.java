package caps_26_shad;

public class Function_Array_1 {

//3.WAP in java using Functions and print all the even numbers in a static array. 
//	create 2 different classes. and call the function.
	
	public static void main(String[] args) {
		
		int arr[] = {4, 5, 8, 9, 2, 6, 10, 17};
		
		System.out.println("Even numbers are");
		
		for(int i = 0 ; i < arr.length ; i++)
		{	
			Function_Even_Code_1.Code_Even(arr[i]);
		}
		

	}

}
