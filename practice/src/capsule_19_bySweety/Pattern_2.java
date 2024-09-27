package capsule_19_bySweety;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		1 
		0 1 
		0 1 0 
		1 0 1 0 
		1 0 1 0 1 

		 */
				int n =5 ;
				int count=1 ;
				for(int r =1 ;r<= n ;r++ )
				{
					for(int c =1 ;c<= r ;c++ )
					{
						System.out.print(count%2 +" ");
						count++ ;	
					}
			     System.out.println();
			}
	}

}
