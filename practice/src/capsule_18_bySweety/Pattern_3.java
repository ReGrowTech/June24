package capsule_18_bySweety;

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		5 
		4 4 
		3 3 3 
		2 2 2 2 
		1 1 1 1 1 
		 
		 
		 */
				int n =5 ;
				for(int r =1 ;r<= n ;r++ )
				{
					for(int c =1 ;c<= r ;c++ )
					{
						System.out.print(n-r+1 +" ");
					}
			     System.out.println();
				}
	}

}
