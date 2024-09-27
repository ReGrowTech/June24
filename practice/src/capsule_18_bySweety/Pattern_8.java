package capsule_18_bySweety;

public class Pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		A 
		A B 
		A B C 
		A B C D 
		A B C D E 
				
		*/
						int n =5 ; // row 
						for(int r =1 ;r<= n ;r++ )
						{
							int temp =64 ;
							for(int c =1 ;c<= r ;c++ )
							{
								System.out.print((char)(c+ temp) +" ");
							}
					     System.out.println();
						}		

		
	}

}
