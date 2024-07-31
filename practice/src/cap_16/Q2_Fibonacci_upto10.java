package cap_16;

public class Q2_Fibonacci_upto10 {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		int last_term = 10;
		for(int i = 1; i<=last_term-2; i++)
		{
			int c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
