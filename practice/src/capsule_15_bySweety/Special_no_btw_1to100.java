package capsule_15_bySweety;

public class Special_no_btw_1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1; // Start from 1

        System.out.println("Krishnamurthy (Special) numbers between 1 and 500:");

        // Outer loop using while to go through numbers from 1 to 500
        while (n <= 500) {
            int sum = 0;
            int temp = n;

            // Inner loop using while to calculate the sum of the factorials of the digits
            while (temp > 0) {
                int digit = temp % 10;

                // Calculate factorial using a while loop
                int factorial = 1;
                int i = 1;
                while (i <= digit) {
                    factorial *= i;
                    i++;
                }

                sum += factorial;
                temp /= 10;
            }

            // Check if the sum of the factorials equals the original number
            if (sum == n) {
                System.out.println(n);
            }

            n++; // Move to the next number
        }
	}

}
