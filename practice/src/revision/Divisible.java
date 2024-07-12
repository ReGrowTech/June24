package revision;

public class Divisible {

	public static void main(String[] args) {
	
		int m = 30;

//Ternary Operator.
		
		String r = (m % 3 ==0  || m % 5 ==0)? "Divisible":"Not Divisble";
		System.out.println(r);
		
// If- else
		
		int n = 30;

		if( n % 3 == 0 &&  n % 5 == 0)
		{ 
			
			System.out.println(n + " Divisable by both 3 & 5");
		}
			
		
		else if ( n % 5 == 0)
		{
			System.out.println(n + " Divisable by 5");
		}
			
		
		else if (n % 3 == 0)
		{
			System.out.println(n + " Divisable by 3 ");
		}
		
		
		else
		{
			System.out.println("Out of range ");
		}

	}
}

		