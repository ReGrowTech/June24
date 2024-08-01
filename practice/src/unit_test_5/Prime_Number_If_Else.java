package unit_test_5;

public class Prime_Number_If_Else {

	public static void main(String[] args) {

//Q4. Write a program to determine if a number is Prime number using if else. 
		
		int n = 19;
		int cnt = 0;
		
		for(int i = 1 ; i <= n ; i++)
		{
			if(n % i == 0)
			{
				cnt++;
			}
		}
		if(cnt == 2)
		{
			System.out.println(n + " is a Prime Number");
		}
		else
		{
			{
				System.out.println(n + " is not a Prime Number");
			}
		}
	}

}
