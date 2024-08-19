package unit_test_06_shad;

public class Sum_Of_EvenNum {

	public static void main(String[] args) {
		
//Q4. WAP to find the sum of all even numbers between 10-1.
		
		int sum = 0;
		
		for(int i = 10 ; 1 <= i ; i--)
		{
			if(i % 2 == 0)
			{
				 sum = sum + i;
			}
		}
		
		System.out.println("Sum of all even numbers are: " + sum );
	}

}
