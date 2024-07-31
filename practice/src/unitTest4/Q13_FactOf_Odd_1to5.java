package unitTest4;

public class Q13_FactOf_Odd_1to5 {

	public static void main(String[] args) {
		int a = 1;
		int n = 5;
		
		while(a<n)
		{
			if(a%2!=0)
			{
				
				int fact = 1;
				int i = 1;
				while(i<=a)
				{
					fact*=i;
					i++;
				}
				System.out.println("The Factorial of "+ a + " is : " + fact);
			}
			a++;
		}
	}
}
	