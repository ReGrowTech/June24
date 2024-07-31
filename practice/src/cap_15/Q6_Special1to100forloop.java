package cap_15;

public class Q6_Special1to100forloop {

	public static void main(String[] args) {
		for(int i = 1; i<=200;i++)
		{
			int temp = i;
			int n = i;
			int ld = 0;
			int sum = 0;
			
			while(temp>0)
			{
				ld = temp%10;
				temp=temp/10;
				
				int fact = 1;
				for(int j=1; j<=ld; j++)
				{
					fact=fact*j;
				}
				sum=sum+fact;
			}
			if(n==sum)
			{
				System.out.println(n+ " : is a special/km number");
			}
		}
		
		
	}

}
