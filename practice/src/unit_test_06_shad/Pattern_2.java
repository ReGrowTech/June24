package unit_test_06_shad;

public class Pattern_2 {

	public static void main(String[] args) {
		
//		# # #
//		# #
//		#
	
		int n = 3 ;
		
		for(int r = 1 ; r <= n ; r++)
		{
			for(int c = 1 ; c <= (n - r + 1) ; c++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
	}

}