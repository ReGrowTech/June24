package capsule_26_bySweety;

public class PrimeNo30To1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int end =1;
		for(int i =30 ;i>=end ;i--)
		{
			int initial_num =i;
			PrimeNo30To1.concept_prime(initial_num);
		}
	}
	public static void concept_prime(int n)
	{
		int cnt=0;
		for(int i=1;i<=n ;i++ )
		{
			if(n%i==0)
			{
				cnt++;
			}
		}
		if(cnt==2)
		{
			System.out.print(n +" ");
		}
		
	}

}
