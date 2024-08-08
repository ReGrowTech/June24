package caps_19;

public class Pattern_Slope_Stars {

	public static void main(String[] args) {
		
//		#####*					*
//		####*				   *
//		###*   ========>	  *
//		##*					 *
//		#*				    *

		int n =  5;
		
		for(int r = 1 ; r <= n ; r++)
		{
			for(int s = 1 ; s <= n-r+1 ; s++) // this is for spaces.
			{
				System.out.print(" ");
			}	
			System.out.println("*");
		}
		
	}

}
