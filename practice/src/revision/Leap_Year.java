package revision;

public class Leap_Year {

	public static void main(String[] args) {
		
// if_else
		int y = 2024;
		
		if ((y % 100 == 0 &&  y % 400 == 0) || (y % 4 ==0 && y % 100 !=0))
		{
			System.out.println("Leap Year");
		}

		else
		{
			System.out.println("Not a Leap Year");
		}
		
// Ternary Operator
		
		int z = 1900;
		String res = ((z % 100 == 0 &&  z % 400 == 0) || (z % 4 ==0 && z % 100 !=0))? "Leap Year" : "Not a Leap Year";
		System.out.println(z + " is " +  res);
	}

}
