package cap_15;

public class Q5_Prime20to1 {

	public static void main(String[] args) {
		int n = 1;
		for(int i = 20; i>=n ; i--)
		{
			int cnt=0;
			for(int j =1 ;j<=i ; j++)
			{
				if(i%j==0)
				{
					cnt++;
				}
			}
			if(cnt == 2)
			{
				System.out.println("prime is :"+ i);
			}
		}
	
	}

}
