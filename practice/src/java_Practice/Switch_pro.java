package java_Practice;

public class Switch_pro {

	public static void main(String[] args) {
		int num1=5,num2=9;
		char ch='*';
		switch(ch) {
		case '+':System.out.println("Sum of num is "+(num1+num2));break;
		case '-':System.out.println("Difference of numbers is "+(num1-num2));break;
		case '*':System.out.println("product of 2 num is "+(num1*num2));break;
		case '/':System.out.println("Division of 2 num is "+(num1/num2));break;
		default:System.out.println("Invalid choice");
		}

	}

}
