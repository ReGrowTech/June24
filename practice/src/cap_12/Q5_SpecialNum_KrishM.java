package cap_12;

public class Q5_SpecialNum_KrishM {

	public static void main(String[] args) {
		int n =145;
		int n1=n;
		int ld =0;
		int sum = 0 ;
		
		//for last digit
		while(n>0)
		{
			ld = n%10;
			n = n/10;
			
			//for factorial
			int fact = 1;
			int i = 1;
			
			while(i<=ld)
			{
				fact=fact*i;
				i++;
			}
			//for sum
			sum=sum+fact;
		}
		//for check(if)
		if(sum == n1)
		{
			System.out.println(n1+ ":is a Special/KrishnaMurti Number");
		}
		else
		{
			System.out.println(n1+ ":is not a Special/KrishnaMurti Number");
		}

	}

}
