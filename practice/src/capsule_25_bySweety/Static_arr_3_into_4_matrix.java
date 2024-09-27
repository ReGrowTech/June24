package capsule_25_bySweety;

public class Static_arr_3_into_4_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int rows = 3, cols = 4; // Dimensions of the matrix
		        int[][] matrix = {
		            {1, 2, 3, 4},
		            {5, 6, 7, 8},
		            {9, 10, 11, 12}
		        }; // Declaration and initialization of a 3x4 matrix

		        // Print the odd elements
		        System.out.println("The odd elements are:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                if (matrix[i][j] % 2 != 0) { // Check if the element is odd
		                    System.out.println(matrix[i][j]); // Print the odd element
		                }
		            }
		        }
		    }
		}
	
