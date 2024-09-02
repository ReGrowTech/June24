package caps_29_shad;

public class For_Each_Even {

	public static void main(String[] args) {
		
//3. WAP in Java using for each loop and find all the even numbers present in the static array.
		
		int arr[] = {2, 1, 4, 3, 6, 5, 8, 7, 10};
		
		System.out.println("Even numbers are");
		
		for(int val : arr)
		{
			if(val % 2 == 0)
			{
				System.out.print(val + " ");
			}
		}

	}

}
