package sweety_program_practic;

public class Prime_no_bw_30_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		String  prime;
		 for (int i = 30; i <= 50; i++) 
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
	            
	             
	        }
	}

}
