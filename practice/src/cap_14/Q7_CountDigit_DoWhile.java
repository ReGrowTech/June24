package cap_14;

public class Q7_CountDigit_DoWhile {

	public static void main(String[] args) {
		int n = 324;
		int cnt = 0;
		
		do
		{
			n=n/10;
			cnt++;
		}
		while(n>0);
		System.out.println(cnt);
	}

}
