package capsule_18_bySweety;

public class Patern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 

		 
		 
		 */
				int n =5 ;
				for(int r =1 ;r<= n ;r++ )
				{
					for(int c =1 ;c<= r ;c++ )
					{
						System.out.print(n-c+1 +" ");
					}
			     System.out.println();
				}
	}

}
