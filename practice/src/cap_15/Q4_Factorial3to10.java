package cap_15;

public class Q4_Factorial3to10 {

	public static void main(String[] args) {
		
		int n = 10;
		for(int i = 3; i<=n; i++)
		{
	
			int fact = 1;
			for(int j =1; j<=i; j++)
			{
				fact=fact*j;
				
			}
			System.out.println("The Factorial of " + i + " is : " + fact);
	}

}
}
