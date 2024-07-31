package cap_14;

public class Q11_Factorial1to5 {

	public static void main(String[] args) {
		int n = 5;
		for(int i =1; i<=n; i++)
		{
			int fact=1;
			for(int j=1; j<=i; j++)
			{
				fact=fact*j;
			}
		System.out.println("The Factorial of " + i + "  is : " + fact);
		}
	}
}