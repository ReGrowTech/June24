package cap_12;

public class Q1_Factorial {

	public static void main(String[] args) {
		int n = 7;
		int fact = 1;
		int a =1;
		
		while(a<=n)
		{
			fact=fact*a;
			a++;
		}
		System.out.println("the factorial of" + n + "is" + fact);

	}

}
