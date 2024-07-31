package unitTest3;

public class Q13_Sumofodd_11_33 {

	public static void main(String[] args) {
		int a = 11;
		int b = 33;
		int sum = 0;
		
		while(a<=b)
		{
			if(a%2!=0)
			{
				sum+=a;
			}
			System.out.println(sum);
			a++;
		}
		
	}

}
