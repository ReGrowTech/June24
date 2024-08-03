package program_practic_By_Sweety;



public class Factorial_num_bw_3to6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(" WAP to print the factorial of all the no between 3 to 6");

           // outer loop for range 
		 //
		 //
		 //
		 for (int i = 3; i <= 6; i++) 
		 {
	            int factorial = 1;
	            for (int j = 1; j <= i; j++)
	            {
	                factorial *= j;
	            }
	            System.out.println("Factorial of " + i + " is: " + factorial);
	        }
	       
	       

	}

}
