package unit_test_03_shad;

public class Sum_Of_Odd_Numbers {

	public static void main(String[] args) {
		
// Q13.WAP to print sum of all odd numbers between 11-33.
		
		int n = 11;
		int sum = 0;
		
		while(n <= 33)
		{
			if(n % 2 !=0)
			{
				sum += n;
			}
			n++;
		}
		System.out.println("Sum of all odd numbers between 11 - 33 is : " + sum);
	}

}
