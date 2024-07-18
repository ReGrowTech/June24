package java_Practice;

public class Sum_digits {

	public static void main(String[] args) {

		int num=78692,sum=0;
		System.out.println("Sum of digits is :");
		while(num>0) {
			int r=num%10;
			sum=sum+r;
			num=num/10;
			
		}
		System.out.print(sum);

	}

}
