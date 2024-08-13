package unit_test_7;

public class Prime_Numbers {

	public static void main(String[] args) {
	
//Q1. WAP to find Prime Numbers Between 2-50.
		
		System.out.println("Prime numbers between 2-50 are \n");
		
		for(int i = 2 ; i <= 50 ; i++)
		{
			int cnt = 0;
			
			for(int j = 1 ; j <= i ; j++)
			{
				if(i % j == 0)
				{
					cnt++;
				}
			}
			
			if(cnt == 2)
			{
				System.out.println(i);
			}
		}

	}

}
