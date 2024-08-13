package unit_test_7;

public class Sum_Even {

	public static void main(String[] args) {
		
//Q2. WAP to find the sum of all even numbers between 2-24.
		
		int sum = 0;
		
		for(int i = 2 ; i <= 24 ; i++)
		{
			if(i % 2 == 0)
			{
				sum = sum + i;
			}
		}
		System.out.println("Sum of even number is : " + sum);
	}

}
