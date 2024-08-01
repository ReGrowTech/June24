package caps_16;

public class Armstrong_100_to_300 {

	public static void main(String[] args) {
		
// WAP to print all the Armstrong number between 100-300.
		
		System.out.println("Armstrong numbers are ");
		
		int i = 100;
		
		while(i<=300)
		{
		
			int n = i;
			int n2 = i;
			
			int cnt = 0;
			
			while(n>0)
			{
				n = n / 10;
				cnt++;
			}
			
			int ld;
			int sum = 0;
			
			while(n2>0)
			{
				ld = n2 % 10;
				n2 = n2 / 10;
				
				int pow = (int)Math.pow(ld, cnt);
				
				sum = sum + pow;
				
			}
			
			
			if(sum == i)
			{
				System.out.println(i);
			}
			
			i++;
		}
	}

}
