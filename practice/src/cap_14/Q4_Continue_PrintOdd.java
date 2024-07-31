package cap_14;

public class Q4_Continue_PrintOdd {

	public static void main(String[] args) {
		int k = 1;
		int n =20;
		
		System.out.println("The Odd No Are = ");
		while(k<=n)
		{
			if(k%2==0)
			{
				k++;
				continue;
			}
			System.out.println(k);
			k++;
		}
	}

}
