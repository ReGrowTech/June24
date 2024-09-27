package capsule_25_bySweety;


public class N_into_N_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a[][]= {{3,4,6,7 },{1,6,7,3},{5,9,8,5}  ,{6,3,5,6} };      
		 
		 for(int r =0;r< a.length ;r++)
		 {
			 for(int c =1;c< a[r].length-2 ;c++)
			 {
				 System.out.print(a[r][c]+"     ");
			 }
			 System.out.println("  ");
		 }
		    
		
		
		
	}

}
