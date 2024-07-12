package unit_test_I;

public class Alpha_Num_SC_Ternary {

	public static void main(String[] args) {
		
		
// Q10. Write a program to print the given character is a special character. Alphabet or digit without using, if else.
		
		
		char chr = '7';
		
		String s = ((chr>='A' && chr<='Z') || (chr>= 'a' && chr<='z'))? "Alphabet": (chr>='0' && chr<='9')? "Number": "Specail character";
		System.out.println(s);
		



	}

}
