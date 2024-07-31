package cap_12;

public class Q3_SumtheNo_ofDigits {

	public static void main(String[] args) {
		int n = 9876;
		int ld =0;
		int sum = 0;
		
		while(n>0)
		{
			ld=n%10;
			n=n/10;
			sum+=ld;
		}
		System.out.println(sum);
	}

}
