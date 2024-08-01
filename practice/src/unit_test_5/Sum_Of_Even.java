package unit_test_5;

public class Sum_Of_Even {

	public static void main(String[] args) {
		
//Q11. Write a program to find the sum of all even numbers between 2-24. 
		
		int b = 24;
		int sum = 0;
		
		for(int a = 2 ; a <= b ; a++)
		{
			if(a % 2 == 0) 
			{
				sum += a;
			}
		}
		
		System.out.println("Sum of even numbers between 2-24 is : " + sum);
	}

}
