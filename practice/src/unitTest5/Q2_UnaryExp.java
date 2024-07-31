package unitTest5;

public class Q2_UnaryExp {

	public static void main(String[] args) {
		int p = 5;
		int q = p++ + p++ + ++p + --p + p-- + ++p + --p;
		System.out.println(p);
		System.out.println(q);
		
		
		int m = 7;
		int n = m-- + ++m + m-- + m++ + ++m + m-- + m++;
		System.out.println(m);
		System.out.println(n);

	}

}
