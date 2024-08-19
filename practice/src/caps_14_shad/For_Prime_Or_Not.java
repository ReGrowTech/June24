package caps_14_shad;

public class For_Prime_Or_Not {

	public static void main(String[] args) {
		
//Q12. WAP to check whether the no is prime number or not using For Loop.
		
		int n = 17;
		int cnt = 0;
		
		for(int i = 1; i <= n ; i++)
		{
			if(n % i == 0)
			{
				cnt++;
			}
		}
		
		
		//System.out.println(cnt);
		
		if(cnt == 2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
	}

}
