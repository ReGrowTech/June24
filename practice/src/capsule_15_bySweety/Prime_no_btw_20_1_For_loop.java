package capsule_15_bySweety;

public class Prime_no_btw_20_1_For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ld = 1;

        for (int n = 20; n >= ld; n--) 
        {
            int count = 0;

            // Checking if n is divisible by any number from 1 to n
            for (int i = 1; i <= n; i++) 
            {
                if (n % i == 0) {
                    count++;
                }
            }

            // A prime number has exactly 2 divisors: 1 and itself
            if (count == 2) {
                System.out.println(n);
            }
        }
		
		
	}

}
