package unit_test_06_shad;

public class Fibonacci_10th_Term {
	public static void main(String[] args) {
		
//Q12. WAP to print Fibonacci Series up to 10 terms.	
		
		int a = 0;
		int b = 1 ;
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		
		int lt_term = 10 ;
		
		for(int i = 1 ; i <= (lt_term - 2) ; i++ )
		{
			int c = a + b;
			System.out.print(c + " ");
			
			a = b;
			b = c;
		}
	}
	

}
