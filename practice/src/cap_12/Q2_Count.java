package cap_12;

public class Q2_Count {

	public static void main(String[] args) {
		int n = 6657;
		int count = 0;
		
		while(n>0)
		{
			n=n/10;
			count ++;
		}
		System.out.println(count);
	}

}
