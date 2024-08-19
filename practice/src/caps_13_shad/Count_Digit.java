package caps_13_shad;

public class Count_Digit {

	public static void main(String[] args) {
		
//2.WAP to count the number of Digits in a variable.
		
		long a = 87890366475l;
		int count = 0;
		
		while(a > 0)
		{
			a = a / 10;
			count++;
		}
		System.out.println("The number of digit : " + count);
		
		


	}

}
