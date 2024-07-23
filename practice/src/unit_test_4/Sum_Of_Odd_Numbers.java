package unit_test_4;

public class Sum_Of_Odd_Numbers {

	public static void main(String[] args) {
		
// Q10. Write a program to find the sum of all odd numbers between 1 - 10. 
		int i = 1;
		int sum = 0;
		
		while(i <= 10)
		{
			if(i % 2 != 0)
			{
				sum += i;
			}
			i++;
		}
		System.out.println("Sum of odd numbers : " + sum);

	}

}
