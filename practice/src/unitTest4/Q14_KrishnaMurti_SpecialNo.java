package unitTest4;

public class Q14_KrishnaMurti_SpecialNo {

	public static void main(String[] args) {
		int n = 145;
		int n1 = n;
		int ld =0;
		int sum=0;
		
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
			System.out.println(n1+":is a Krishnamurti number");
		}
		else
		{
			System.out.println(n1+":is not a Krishnamurti number");
		}
	}

}
