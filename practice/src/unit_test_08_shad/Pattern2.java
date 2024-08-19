package unit_test_08_shad;

public class Pattern2 {

	public static void main(String[] args) {
		
//		#
//	   # #
//	  # # #
//	 # # # #
//	  # # #
//	   # #
//	    #
		
		int n = 4;
		
		for(int r = 1 ; r <= n ; r++)
		{
			for(int s = 1 ; s <= (n - r + 1) ; s++)
			{
				System.out.print(" ");
			}
			
			for(int c = 1 ; c <= r ; c++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
		
		int m = 3;
		
		for(int r = 1 ; r <= m ; r++)
		{
			for(int s = 1 ; s <= r ; s++)
			{
				System.out.print(" ");
			}
			
			for(int c = 1 ; c <= (m - r + 1) ; c++)
			{
				System.out.print(" #");
			}
			System.out.println();
		}
	}

}
