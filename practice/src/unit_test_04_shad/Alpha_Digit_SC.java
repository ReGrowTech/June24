package unit_test_04_shad;

public class Alpha_Digit_SC {

	public static void main(String[] args) {
		
// Q5. WAP to check whether the given character is an alphabet, digit or a special character using Ternary operator. 
	
		char ch = '&';
		
		String res = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))? "Alphabet" : (ch >= '0' && ch <= '9')? "Digit" : "Special Character";

		System.out.println(res);
	}

}
