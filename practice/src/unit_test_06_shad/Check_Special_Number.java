package unit_test_06_shad;

public class Check_Special_Number {

	public static void main(String[] args) {
		
//Q6. WAP to check whether the no, is special no. or not?
		
		int a = 40585;
		int b = a;
		int ld;
		int sum = 0;
		
		while(a > 0)
		{
			ld = a % 10;
			a = a / 10;
			
			int fact = 1;
			
			for(int i = 1 ; i <= ld ; i++)
			{
				fact = fact * i;
			}
			
			sum = sum + fact;
		}
		
		if(sum == b)
		{
			System.out.println(b + " is a Special Number");
		}
		else
		{
			System.out.println(b + " is not a Special Number");
		}

	}

}
