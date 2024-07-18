package java_Practice;

public class first_last_digit {

	public static void main(String[] args) {
		int num=78692,r=0;
		System.out.println("Last digit is :"+(num%10));
		while(num>0) {
			r=num%10;
			num=num/10;
		}
		System.out.println("First digit is :"+r);
	}

}
