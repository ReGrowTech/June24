package unitTest5;

public class Q4_PrimeCheck_forloop {

	public static void main(String[] args) {
		int n = 2;
		int cnt =0;
		for(int i =1; i<=n;i++)
		{
			if(n%i==0)
			{
				cnt++;
			}
			
		}
		if(cnt==2)
		{
			System.out.println(n+" : is a prime number");
		}
		else
		{
			System.out.println(n+" : is not a prime number");
		}
	}

}
