package unit_test_07_shad;

public class Pattern2 {

	public static void main(String[] args) {
		
//     #
//    # #
//   # # #
//  # # # #
		
		int n =  4;
		
		for(int r = 1 ; r <= n ; r++)
		{
			for(int s = 1 ; s <= (n - r + 1) ; s++)  // this is for spaces.
			{
				System.out.print(" ");
			}
			
			for(int c = 1 ; c <= r ; c++)  // this is for stars.
			{
				System.out.print("# ");
			}
			
			System.out.println();
		}
	}

}
