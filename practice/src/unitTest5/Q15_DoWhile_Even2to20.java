package unitTest5;

public class Q15_DoWhile_Even2to20 {

	public static void main(String[] args) {
		int a = 2;
		int n = 20;
		do
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
			a++;
		}
		while(a<=n);
	}

}
