package revision;

public class Odd_Even_Ternary {
// Using if else

	
		public static void main(String [] args)
		{

			int a = 41;
			
			if ( a % 2 == 0)
			{
				System.out.println("Even Number");
			}

			else
			{
				System.out.println("Odd Number");
			}
		
		


//Ternary Operator

		String res = (a % 2 == 0)? "Even" : "Odd";

		System.out.println(res);

		}
}

