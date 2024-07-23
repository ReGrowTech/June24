package unit_test_2;

public class Number_Is_Divisible {

	public static void main(String[] args) {
		
		
//Q6. Write the program to check if a given number is divisible by 3,7 or both. 
		

		int d = 28;
		
		if((d % 3 == 0) && (d % 7 == 0))
		{
			System.out.println("Its divisible by both 3 & 7");
		}
		
		else if(d % 3 == 0)
		{
			System.out.println("Its divisible by only 3");
		}
		
		else if(d % 7 == 0)
		{
			System.out.println("Its divisible by only 7");
		}
		
		else
		{
			System.out.println("Neither its divisible by 3 nor 7");
		}
		

	}

}
