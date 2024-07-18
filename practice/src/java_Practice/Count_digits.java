package java_Practice;

public class Count_digits {

	public static void main(String[] args) {
		int num=78692,count=0;
		
		System.out.println("no of digits are :");
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
