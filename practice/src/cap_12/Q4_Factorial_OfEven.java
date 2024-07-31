package cap_12;

public class Q4_Factorial_OfEven {

	public static void main(String[] args) {
		int a = 3;
		int n = 10;
		
		while(a<n)
		{
			if(a%2==0)
			{
				int i = 1;
				int fact =1;
				
				while(i<=a)
				{
					fact=fact*i;
					i++;
				}
				System.out.println("Factorial of" +" "+  a  + " number is" + fact);
			}
			a++;
		}
	}
}

