package capsule_18_bySweety;

public class Patern_6 {

	public static void main(String[] args) {
		
/*
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 
		
 */
		int n =5 ; // row 
		for(int r =1 ;r<= n ;r++ )
		{
		
			for(int c =1 ;c<= n-r+1 ;c++ )
			{
				System.out.print((n-c+1) +" ");
			}
	     System.out.println();
		}

		
	}

}
