package unit_test_6;

public class Pattern_5 {

	public static void main(String[] args) {
		
//		1
//		1 2
//		1 2 3
//		1 2 3 4
		
		int n = 4 ;
		
		for(int r = 1 ; r <= n ; r++)
		{
			for(int c = 1 ; c <= r ; c++)
			{
				System.out.print(c + " ");
			}
			System.out.println();
		}

	}

}
