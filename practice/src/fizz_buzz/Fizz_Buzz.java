package fizz_buzz;

public class Fizz_Buzz {

	public static void main(String[] args) {
		
// Write a program to find the number is fizz buzz or both. 
		
		int num = 15;
		
		if(num % 5 == 0 && num % 3 == 0)
		{
			System.out.println(num +  " is fizz & buzz ");
		}
		
		else if(num % 3 ==0)
		{
			System.out.println(num + " is fizz ");
		}
		
		else if(num % 5 ==0)
		{
			System.out.println(num + " is buzz ");
		}
		
		else
		{
			System.out.println(num + " is not a fizz nor buzz");
		}
	}

}
