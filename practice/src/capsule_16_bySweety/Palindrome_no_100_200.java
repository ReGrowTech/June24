package capsule_16_bySweety;

public class Palindrome_no_100_200 {

	public static void main(String[] args)
	{
		int ed =200;
		for(int str =100 ;str <= ed ;str++)
		{
			int n= str;
			int rev =0;
			while (n>0)
			{
				int ld = n%10;
				n= n/10;
				rev = (rev*10)+ld ;
				
			}
			
			if(str==rev)
			{
				System.out.println(str +" its Palindrome No ");
			}
		}

	}

}
