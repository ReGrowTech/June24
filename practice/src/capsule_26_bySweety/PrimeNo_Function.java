package capsule_26_bySweety;

public class PrimeNo_Function {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int a [][] ={{3,9,6} , {7,16,5} , {4,8,17} };
		// for 2d array locic loop
		for(int r =0;r<a.length ;r++)
		{
			for(int c=0 ;c< a[r].length ;c++)
			{
			int n = a[r][c];	
			PrimeNo_Function.Logic_prime(n);
			}
		}
	}
	public static void Logic_prime(int num)
	{
		int cnt=0;
		for(int i=1;i<=num ;i++ )
		{
			if(num%i==0)
			{
				cnt++;
			}
		}
		if(cnt==2)
		{
			System.out.println(num +" ");
		}
		
	}
	
	

}

