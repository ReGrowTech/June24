package capsule_19_bySweety;

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
		    * 
		    * * 
		   * * * 
		  * * * * 
		 * * * * * 
		 
		 
		 */
				// upper loop tringele
				int n=5 ;
				for(int r= 1; r<=n ;r++)
				{
					for(int s= 1; s<=n-r+1 ;s++)
					{
						System.out.print(" ");
					}
					for(int c= 1; c<=r ;c++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
	}

}
