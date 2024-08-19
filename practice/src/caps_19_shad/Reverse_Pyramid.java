package caps_19_shad;

public class Reverse_Pyramid {

	public static void main(String[] args) {
		
//	#* * * * *			  #			*****				* * * * *
//	##* * * *     		  ##		 ****				 * * * *
//	###* * *	======>	  ###   +  	  ***    =====        * * *
//	####* *				  ####		   **				   * *
//	#####*				  #####			*			        *
		
		int n =  5;
		
		for(int r = 1 ; r <= n ; r++)
		{
			for(int s = 1 ; s <= r ; s++) // this is for spaces.
			{
				System.out.print(" ");
			}
			
			for(int c = 1 ; c <= n-r+1 ; c++) // this is for stars.
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
