package capsule_25_bySweety;

public class Static_3x4_array_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {{3,15,7,6},{4,7,2,9},{1,8,6,13}};
	     
        for (int r = 0; r < a.length; r++)
        {
            for (int c = 0; c < a[r].length; c++)
            {
            	if( a[r][c]%2 != 0) 
            	{
            		
                System.out.print(a[r][c] + " "); // Print each element
                
            	}
            
            }
            System.out.println(); // New line after each row
	
        }

  }
}