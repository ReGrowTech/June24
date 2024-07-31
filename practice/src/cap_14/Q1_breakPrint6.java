package cap_14;

public class Q1_breakPrint6 {

	public static void main(String[] args) {
		int a = 1;
		int n = 10;
		
		while(a<=n)
		{
			if(a==6)
			{
				System.out.println(a);
				break;
			}
			System.out.println(a);
			a++;
		}

	}

}
