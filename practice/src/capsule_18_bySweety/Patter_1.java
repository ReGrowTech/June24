package capsule_18_bySweety;

public class Patter_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
		1 2 3 4 5 
		1 2 3 4 
		1 2 3 
		1 2 
		1 

		 
		 */
				
				int n =5 ;
				for(int r =1 ;r<= n ;r++ )
				{
					for(int c =1 ;c<=n-r+1 ;c++ )
					{
						System.out.print(c + " ");
					}
			     System.out.println();
				}
		
	}

}
