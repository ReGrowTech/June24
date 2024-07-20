package unit_test_I;

public class Expression_Solving {

	public static void main(String[] args) {
		
// Q7. Given the variables int x = 8 . What will be the value of a and x in the given expression? 
		
		int x = 8;
		
		int a = x++ + ++x + x-- + --x + x++ +x-- + ++x;
		System.out.println(x);
		System.out.println(a);

// Q11. Given the variables int z = 10 . What will be the value of z and c in the given expression? 
		

 		int z = 10;
 		int c = z-- + ++z + z++ + --z + z-- + ++z + z++ + --z;
 		System.out.println(z);
 		System.out.println(c);

	}

}
