package unitTest4;

public class Q15_Armstrong {

	public static void main(String[] args) {
		int n = 153;
		int n1 = n;
		int n2 = n;
		int cnt = 0;
		
		while(n>0)
		{
			n=n/10;
			cnt++;
		}
		
		int ld = 0;
		int sum = 0;
		
		while(n1>0)
		{
			ld = n1%10;
			n1= n1/10;
			int pow = (int)Math.pow(ld, cnt);
			sum = sum + pow;
		}
		
		
		
		if(n2==sum)
		{
			System.out.println(n2+ ":is an Armstrong Number");
		}
		else
		{
			System.out.println(n2+ ":is not an Armstrong Number");
		}

	}

}
