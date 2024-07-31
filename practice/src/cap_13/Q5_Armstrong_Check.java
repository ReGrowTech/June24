package cap_13;

public class Q5_Armstrong_Check {

	public static void main(String[] args) {
		int n = 153;
		int n1 = n;
		int n2 = n;
		int count = 0;
		
		//ffor count
		while(n>0)
		{
			n=n/10;
			count++;
		}
			//for lastDigit and power and sum
			int ld = 0;
			int sum = 0;
			
			while(n1>0)
			{
				ld = n1%10;
				n1 = n1/10;
				int pow = (int)Math.pow(ld, count);
				sum = sum + pow;
			}
			//for check(if)
		if(sum == n2)
		{
			System.out.println(n2+ ":is a armstrong number");
		}
		else
		{
			System.out.println(n2+ ":is not a armstrong number");
		}
	}

}

