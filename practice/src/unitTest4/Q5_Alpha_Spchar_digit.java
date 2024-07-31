package unitTest4;

public class Q5_Alpha_Spchar_digit {
	public static void main(String args[]) {
		char ch = '7';
		String result = (ch>='0'&& ch<='9')?"DIGIT" : (ch>='A' && ch<='Z' || ch>='a' && ch<='z')? "ALPHABET":"SPECHIAL CHARACTER";
		System.out.println(result);
	}
}