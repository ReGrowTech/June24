package java_Practice;

public class Ternary_operator {

	public static void main(String[] args) {

		int num1=45,num2=23,num3=34;
		int max=0;
		max=(num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);
		System.out.println("Greatest of 3 is :"+max);

	}

}
