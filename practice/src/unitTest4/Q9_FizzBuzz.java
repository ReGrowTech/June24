package unitTest4;

public class Q9_FizzBuzz {

	public static void main(String[] args) {
		int num = 15;
		if(num%3==0 && num%5==0) 
		{
			System.out.println(num+":is a FizzBuzz Both");
		}
		else if (num%3==0)
		{
			System.out.println(num+":is a Fizz");
		}
		else if (num%5==0)
		{
			System.out.println(num+"is a Buzz");
		}
		else
		{
			System.out.println(num+"is not a FizzBuzz nor Fizz neither Buzz");
		}
	}

}
