package capsule_18_bySweety;

public class Pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*

		E D C B A 
		E D C B 
		E D C 
		E D 
		E 


		 */
				int n =5 ; // row 
				for(int r =1 ;r<= n ;r++ )
				{
					int temp=64 ;
					for(int c =1 ;c<= n-r+1 ;c++ )
					{
						System.out.print((char)(n-c+1+ temp) +" ");
					}
			     System.out.println();
				}	
	}

}
