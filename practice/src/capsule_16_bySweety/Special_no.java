package capsule_16_bySweety;

public class Special_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Special numbers between 100 and 200 are:");

        for (int i = 100; i <= 200; i++)
        {
            int sum = 0;
            int temp = i;

            // Calculate the sum of the factorials of the digits
            while (temp > 0) 
            {
                int digit = temp % 10;
                int factorial = 1;

                // Calculate factorial of the digit
                for (int j = 1; j <= digit; j++) 
                {
                    factorial *= j;
                }

                sum += factorial; // Add factorial to sum
                temp /= 10; // Remove the last digit
            }

            // Check if the sum of factorials equals the original number
            if (sum == i)
            {
                System.out.println(i); // Print the special number
            }
        }
    }
}
