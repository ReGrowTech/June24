package capsule_18_bySweety;

public class Pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		65 
		65 66 
		65 66 67 
		65 66 67 68 
		65 66 67 68 69

		 */
				int n =5 ; // row 
				for(int r =1 ;r<= n ;r++ )
				{
					int temp =64 ;
					for(int c =1 ;c<= r ;c++ )
					{
						System.out.print(c+ temp +" ");
					}
			     System.out.println();
				}
				
	}

}
