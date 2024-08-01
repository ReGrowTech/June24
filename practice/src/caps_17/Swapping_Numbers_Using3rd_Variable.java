package caps_17;

public class Swapping_Numbers_Using3rd_Variable {

	public static void main(String[] args) {
		
//  WAP to Swap 2 numbers using 3rd variable.
		
		int a = 100 ;
		int b = 50;
		
		System.out.println("Before Swapping: \n" + "a = " + a + " b = " +b  );
		
		int c;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("After Swapping: \n" + "a = " + a + " b = " +b  );
	}

}
