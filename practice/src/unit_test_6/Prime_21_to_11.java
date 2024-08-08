package unit_test_6;

public class Prime_21_to_11 {

	public static void main(String[] args) {
		
//Q3. WAP to find the prime numbers between 21-11 using for loop.
		
		System.out.println("Prime numbers between 21-11 are:");
		
		for(int i = 21 ; i >= 11 ; i--)
		{
			int cnt = 0;
			
			for(int j = 1 ; j <= i ; j++)
			{
				if(i % j == 0)
				{
					cnt ++;
				}
			}
			if(cnt == 2)
			{
				System.out.println(i);
			}
		}
	}

}
