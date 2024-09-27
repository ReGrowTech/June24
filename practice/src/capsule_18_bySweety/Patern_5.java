package capsule_18_bySweety;

public class Patern_5 {

	public static void main(String[] args) {
		
/*
5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 

 		
 */
		

		int n =5 ; // row 
		for(int r =1 ;r<= n ;r++ )
		{
		
			for(int c =1 ;c<= n-r+1 ;c++ )
			{
				System.out.print((n-r+1) +" ");
			}
	     System.out.println();
		}

	}

}
