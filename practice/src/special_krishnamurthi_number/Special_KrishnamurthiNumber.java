package special_krishnamurthi_number;

public class Special_KrishnamurthiNumber {

	public static void main(String[] args) {
		int n = 145;
		int ld;
		int sum =0;
		int n1=n;
		
		while(n>0)
		{
			ld=n%10;
			n=n/10;
			
			
			int fact = 1;
			int a = 1;
			
			
			while(a<=ld)
			{
				fact=fact*a;
				a++;
			}
			sum=sum+fact;
		}
		
		
		if(n1==sum)
		{
			System.out.println(n1 + ":is a Special/Krishnamurthi Number");
		}
		else
		{
			System.out.println(n1 + ":is not a Special/Krishnamurthi Number");	
		}
		
		
	}

}
