package capsule_19_bySweety;

public class Pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5 ; // row 
		for(int r =1 ;r<= n ;r++ )
		{
		
			for(int c =1 ;c<= n-r+1 ;c++ )
			{
				System.out.print(((n-r+1)-c+1) +" ");
			}
	     System.out.println();
		}
	}

}
