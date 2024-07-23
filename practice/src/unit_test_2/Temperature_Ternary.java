package unit_test_2;

public class Temperature_Ternary {

	public static void main(String[] args) {
		
// Q7. Write a program using ternary operator to determine if the temperature is "hot", "warm" or "cold" based on the given temperature value.
// 		Consider temperature above 30 degrees as "Hot", between 15 and 30 degrees (inclusive) as "Warm", and below 15 degrees as "Cold". 

		int deg = 25;
		
		String temp  = (deg > 30)? "Hot" : (deg >= 15 && deg <= 30)? "Warm" : "Cold";
		System.out.println(temp);
	}

}
