package capsule_25_bySweety;
public class Dynamic2x3_array
{
	public static void main(String[] args) 
	{
		int[][] a = {{3,6,7},{4,7,23}};
		     
		        for (int r = 0; r < a.length; r++)
		        {
		            for (int c = 0; c < a[r].length; c++)
		            {
		                System.out.print(a[r][c] + " "); // Print each element
		            }
		            System.out.println(); // New line after each row
		        }
	
	}

}
