package unitTest3;

public class Q5_UnaryExp {

	public static void main(String[] args) {
		int c =2;
		int d = ++c + --c + c++ + c-- + ++c + c-- + c +4;
		System.out.println(d);

		
		
		
		
		
		int z = 5;
		int p = (++z + z++ + z + z-- + z*(z++ + 5));
		System.out.println(p);
	}

}


