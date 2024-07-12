package while_loop;

public class Reverse_The_Number {

	public static void main(String[] args) {
		
		int n = 852;
		int ld;
		int rev = 0;
		
		while(n>0)
		{
			ld = n % 10;
			n = n / 10;
			rev = (rev * 10) + ld;
		}
		System.out.println(rev);

	}

}
