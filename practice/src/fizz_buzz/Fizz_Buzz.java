package fizz_buzz;

public class Fizz_Buzz {

	public static void main(String[] args) {
		int num = 15;
		if(num%3 == 0 && num % 5== 0)
		{
			System.out.println(num + ":is fizz and buzz");	
		}
		else if (num%3==0)
		{
			System.out.println(num + ":is fizz ");
		}
		else if(num%5==0)
		{
			System.out.println(num + ":is buzz");
		}
		else
		{
			System.out.println(num + ":is neither fizz nor buzz");
		}
	}

}
