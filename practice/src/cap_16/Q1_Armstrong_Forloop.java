package cap_16;

public class Q1_Armstrong_Forloop {

	public static void main(String[] args) {
		int n = 153;
		int cnt = 0;
		
		for(int n2 = n ; n2>0 ; n2=n2/10)
		{
			cnt++;
		}

		int ld = 0;
		int sum = 0;
		for(int n3=n; n3>0 ; n3=n3/10)
		{
			ld=n3%10;
			int pow = (int)Math.pow(ld, cnt);
			sum=sum+pow;
		}
		if(sum==n)
		{
			System.out.println(n +" :is a Armstrong no");
		}
	}

}
