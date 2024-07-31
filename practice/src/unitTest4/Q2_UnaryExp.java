package unitTest4;

public class Q2_UnaryExp {

	public static void main(String[] args) {
		int y = 5;
		int result1 = y++ + --y + ++y + y-- + y + ++y + y++ + --y + y-- + y;
		System.out.println(result1);
		
		
		int a = 7;
		int result2 = --a + a++ + ++a + a-- + a + --a + ++a + a-- + a++ + a;
		System.out.println(result2);

	}

}
