package unit_test_03_shad;

public class Unary_Operation {

	public static void main(String[] args) {
		
//If c = 2, then find:
		
		int c = 2;
		int d = ++c + --c + c++ + c--+ ++c + c-- + c + 4;
		
		System.out.println("Value of c = " + c);
		System.out.println("Value of d = " + d);
		
		
//If z = 5, then find:
		
		int z = 5;
		z= (++z + z++ + z + z-- + z * (z++ + 5));
		
		System.out.println("Value of z = " + z);
	}

}
