package caps_17;

public class Swapping_Numbers_Without3rd_Variable {

	public static void main(String[] args) {
		
// WAP to Swap 2 numbers without using 3rd variable.	
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swapping: \n" + "a = " + a + ", b = " +b  );
		
		a = a + b; // 10 + 20 = 30
		b = a - b; // 30 - 20 = 10
		a = a - b; // 30 - 10 = 20
		
		System.out.println("After Swapping: \n" + "a = " + a + ", b = " +b  );

	}

}
