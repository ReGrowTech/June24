package unit_test_06_shad;

public class Pattern_4 {

	public static void main(String[] args) {
		
//		1
//		2 3
//		4 5 6
//		7 8 9 10
	
		int n = 4 ;
		int cnt = 1;
		
		for(int r = 1 ; r <= n ; r++)
		{
			for(int c = 1 ; c <= r ; c++)
			{
				System.out.print(cnt + " ");
				cnt++;
			}
			System.out.println();
		}

	}

}