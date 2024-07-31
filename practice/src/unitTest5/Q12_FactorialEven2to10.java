package unitTest5;

public class Q12_FactorialEven2to10 {

	public static void main(String[] args) {
		int n = 10;
		for (int i =2 ; i<= n; i++)
		{
		if(i%2==0)
		{
			int fact = 1;
			for(int j =1 ; j<=i; j++)
			{
				fact=fact*j;
			}
			System.out.println("Factorial of even "+ i + " is :"+ fact);
		}
		}

	}

}
