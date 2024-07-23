package unit_test_4;

public class Special_Number {

	public static void main(String[] args) {
		
// Q14. Write a program to check whether the number is Krishnamurthy / Special number or not.		
		
		int n = 145;
		int n2 = n;
		int ld;
		int sum = 0;

		
		while(n > 0)
		{
			ld = n % 10 ;
			n = n / 10;
			
			int i = 1;
			int fact = 1;
						
			while(i <= ld)
			{
				fact = fact * i;
				i++;
			}
			sum = sum + fact;
	
		}
		if(sum == n2)
		{
			System.out.println(n2 + " is a Special number");
		}
		else
		{
			System.out.println(n2 + " Not a Special number");
		}
	}

}
