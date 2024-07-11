package java_Practice;

public class Ifelse_max {

	public static void main(String[] args) {
		int num1=45,num2=34,num3=78;
		
		if(num1>num2&&num1>num3) {
			System.out.println(num1+" is greatest");
		}
		else if(num2>num3) {
			System.out.println(num2+" is greatest");
		}
		else {
			System.out.println(num3+" is greatest");
		}

	}

}
