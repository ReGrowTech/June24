package capsules.capsules_V;

public class Ternary_Operator {
	public static void main(String[] args) {
		
		
// WAP to print the greater of 2 numbers using ternary operator.
		
		int a = 10;
		int b = 20;
		
		int result = (a > b)? a : b;
		System.out.println("The greatest number is : " + result);
		
//4. WAP to print whether the number is even or odd using ternary operator.
		
		int n = 108;
		
		String res = (n % 2 == 0)? "Even" :  "Odd";
		System.out.println("The number is : " + res);
		
	}

}
