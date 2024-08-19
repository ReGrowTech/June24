package caps_19_shad;

public class Pattern_110 {

	public static void main(String[] args) {
		
//		1
//		1 0
//		1 0 1
//		1 0 1 0
//		1 0 1 0 1

 		
		int n = 5;
		
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
