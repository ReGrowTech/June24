package patterns;

public class Pattern_Diamond {

	public static void main(String[] args) {
		
//		 *
//		* *
//	   * * *
//	  * * * *
//	 * * * * *
//	  * * * *
//	   * * *
//	    * *
//	     *
		
		int n = 5;
		
		for(int r = 1 ; r <= n ; r++)
		{
			for(int s = 1 ; s <= n-r+1 ; s++)
			{
				System.out.print(" ");
			}
			for(int c = 1 ; c <= r ; c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		

		int m = 4;
		
		for(int r2 = 1 ; r2 <= m ; r2++)
		{
			for(int s2 = 1 ; s2 <= r2 ; s2++)
			{
				System.out.print(" ");
			}
			for(int c2 = 1 ; c2 <= m - r2 + 1 ; c2++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
