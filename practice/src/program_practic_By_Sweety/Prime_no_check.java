package program_practic_By_Sweety;



public class Prime_no_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// prime no - no greater than 1 has no positive divisor orther than 1 
		//  2 3 5 7 are prime 
		
		// prime no between 1 to 20 //for loop
		
		 for (int i = 1; i <= 20; i++) 
		 {
	            int divisorCount = 0;

	            if (i > 1)
	            {
	                for (int j = 1; j <= i; j++)
	                {
	                    if (i % j == 0) 
	                    {
	                        divisorCount++;
	                    }
	                }
	            }

	            if (divisorCount == 2)
	            {
	                System.out.println(i + " is a prime number.");
	            }
	            else 
	            {
	                System.out.println(i + " is not a prime number.");
	            }
	        }
		
		
		
		

	}

}
