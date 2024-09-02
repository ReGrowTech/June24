package patterns_shad;

public class Number_RHP {

	public static void main(String[] args) {
		
//		1
//		2 2
//		3 3 3
//		4 4 4 4
		
		int n = 4;
		
		for(int r = 1 ; r <= n ; r++)
		{
			for(int c = 1 ; c <= r; c++)
			{
				System.out.print(r + " ");
			}
			System.out.println();
		}
	}

}
