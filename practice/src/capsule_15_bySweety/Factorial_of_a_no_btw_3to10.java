package capsule_15_bySweety;

public class Factorial_of_a_no_btw_3to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 for (int n = 3; n <= 10; n++) 
		 {
	            long factorial = 1;

	            // Calculate the factorial of n
	            for (int i = 1; i <= n; i++)
	            {
	                factorial *= i;
	            }

	            // Print the factorial of the current number
	            System.out.println("Factorial of " + n + " is: " + factorial);
	        }
		
	
		
	}

}
