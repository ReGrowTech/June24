package capsule_25_bySweety;

public class Factorial_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] factorials = new int[5];
	        
	        // Calculate factorials and store them in the array
	        for (int i = 0; i < 5; i++) 
	        {
	            int fact = 1;
	            for (int j = 1; j <= i + 1; j++) 
	            {
	                fact *= j;
	            }
	            factorials[i] = fact;
	        }

	        // Print the factorials
	        System.out.println("First 5 factorials are:");
	        for (int i = 0; i < 5; i++)
	        {
	            System.out.println((i + 1) + "! = " + factorials[i]);
	        }
	}

}
