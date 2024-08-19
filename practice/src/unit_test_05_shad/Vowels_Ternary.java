package unit_test_05_shad;

public class Vowels_Ternary {

	public static void main(String[] args) {
	
// Q3.Write the program to check if a given character is vowel or not using the ternary operator.
		
		char ch = 'U';
		
		String res = ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))? "Vowel":"Not a Vowel";
				
		System.out.println(res);

	}

}
