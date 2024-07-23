package unit_test_4;

public class Unary_Question {

	public static void main(String[] args) {
		
// Q2. Find the result.
		
		int y = 5;
		int res = y++ + --y + ++y + y-- + y + ++y + y++ + --y + y-- + y;
		
		System.out.println(res);
		
		int a = 7;
		int out = --a + a++ + ++a + a-- + a + --a + ++a + a-- + a++ + a;
		
		System.out.println(out);
	}

}
