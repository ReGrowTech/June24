package cap_14;

public class Q9_FactorialofNo_ForLoop {

	public static void main(String[] args) {
		int n = 4;
		int fact = 1;
		for (int i = 1; i<=n; i++)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial of "+ n + " is :" + fact);
	}

}
