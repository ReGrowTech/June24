package program_practic_By_Sweety;

public class Fizz_Buzz_FizzBuzz_no_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// fizz divisible by 3
		//buzz divisible by 5
		// fizz buzz in a no divisible by both 
		
		int num =15;
		
		if(num%3==0 && num%5==0)
		{
			System.out.println(" its a FizzBuzz no  - "+num );
		}
		else if(num%3==0)
		{
			System.out.println(" its a Fizz  no  - "+num );
		}
		else if(num%5==0)
		{
			System.out.println(" its a Buzz no  - "+num );
		}
		else
		{
			System.out.println(" please enter valid number  " );
		}
		
	}

}
