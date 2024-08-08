package caps_19;

public class Pattern_101 {

	public static void main(String[] args) {
		
//		1
//		0 1
//		0 1 0
//		1 0 1 0
//		1 0 1 0 1
		
		int n = 5;
		int cnt = 1;
		
		for(int r = 1 ; r <= n ; r++)
		{
			for(int c = 1 ; c <= r ; c++)
			{
				System.out.print(cnt % 2 + " ");
				cnt ++;
			}
			System.out.println();
		}
	}

}
