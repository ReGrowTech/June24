package unit_test_07_shad;

public class Pattern3 {

	public static void main(String[] args) {
//		
//		*
//		 *
//		  *
//		   *

		int n =  4;
		
		for(int r = 1 ; r <= n ; r++)
		{
			for(int s = 1 ; s <= r ; s++) // this is for spaces.
			{
				System.out.print(" ");
			}	
			System.out.println("*");
		}
		
	}

}
