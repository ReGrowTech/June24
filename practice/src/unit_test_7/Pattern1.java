package unit_test_7;

public class Pattern1 {

	public static void main(String[] args) {
		
//		1
//		1 0
//		1 0 1
//		1 0 1 0
		
		int n = 4;
		
		for(int r = 1 ; r <= n ; r++)
		{
			for(int c = 1 ; c <= r ; c++)
			{
				System.out.print(c % 2 + " ");
			}
			System.out.println();
		}

	}

}
