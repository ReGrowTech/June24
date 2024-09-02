package for_each_loop;

public class Odd_Numbers {

	public static void main(String[] args) {
		
		int arr[] = {2, 1, 4, 3, 6, 5, 8, 7, 10};
		
		System.out.println("Odd numbers are");
		
		for(int val : arr)
		{
			if(val % 2 != 0)
			{
				System.out.print(val + " ");
			}
		}


	}

}
