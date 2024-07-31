package cap_14;

public class Q2_continuePrintExcept5 {

	public static void main(String[] args) {
		int a = 1;
		int n = 10;
		
		while(a<=n)
		{
			if(a==5)
			{
				a++;
				continue;
			}
			System.out.println(a);
			a++;
		}

	}

}
