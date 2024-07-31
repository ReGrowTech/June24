package unitTest5;

public class Q5_Sum10Natural {

	public static void main(String[] args) {
		int a = 1;
		int n = 10;
		int sum = 0;
		
		while(a<=n)
		{
			sum=sum+a;
			a++;
		}
		System.out.println("The sum of first 10 Natural Number is :" + sum);
	}

}
