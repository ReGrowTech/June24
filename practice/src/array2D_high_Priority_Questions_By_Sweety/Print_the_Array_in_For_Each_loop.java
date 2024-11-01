package array2D_high_Priority_Questions_By_Sweety;

public class Print_the_Array_in_For_Each_loop {

	public static void main(String[] args) {
		
		int a[][] = {{1,2,3,4},{5,2,3,6}};
		
		// Using for-each loop to print the 2D array
        for (int[] row : a) 
        {          // Outer loop for each row
        	
            for (int element : row) 
            {   // Inner loop for each element in the row
               
            	System.out.print(element + " ");
            }
            System.out.println();       // Newline after each row
        }
		
	}

}
