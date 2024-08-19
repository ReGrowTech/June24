package unit_test_05_shad;

public class Unary_Operation {

	public static void main(String[] args) {
		
// Q2. Find the result. 
	
// i>
		int p = 5;
		
		int q = p++ + p++ + ++p + --p + p-- + ++p + --p;
		
		System.out.println("Value of p :" + p);
		System.out.println("Value of q :" + q);

		
// ii>
		int m = 7;
		
		int n = m-- + ++m + m-- + m++ + ++m + m-- + m++;
		
		System.out.println("Value of m :" + m);
		System.out.println("Value of n :" + n);

	}

}
