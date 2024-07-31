package unitTest5;

public class Q11_SumofEven2to24 {

	public static void main(String[] args) {
		int sum = 0;
		int n = 24;
		for(int i = 2; i<=n ; i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				System.out.println("The sum of all even" + i + " is : " + sum);
			}
			
		}
	}

}
