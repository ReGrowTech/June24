package while_loop;

public class AddGiven_value {

	public static void main(String[] args) {
		int n = 754;
		int ld;
		int sum=0;
		
		while(n>0) {
			ld=n%10;
			n=n/10;
			sum=sum+ld;
		}
		System.out.println(sum);
	}

}
