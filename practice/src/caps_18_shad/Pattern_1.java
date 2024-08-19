package caps_18_shad;

public class Pattern_1 {

	public static void main(String[] args) {
		
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1

		int n = 5;
		
		for(int r = 1 ; r <= n ; r++)
		{
			for(int c = 1 ; c <= (n - r + 1)  ; c++)
			{
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}

}
