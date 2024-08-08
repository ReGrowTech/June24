package patterns;

public class Pattern7 {

	public static void main(String[] args) {
		
//		5 4 3 2 1
//		4 3 2 1
//		3 2 1
//		2 1
//		1
		
		int n = 5;
		int count = 5;
		
		
		for(int r = 1 ; r <= n ; r++)
		{
			int cnt = count;
			
			for(int c = 1 ; c <= (n - r + 1) ; c++)
			{
				System.out.print(cnt + " ");
				 cnt--;
			}
			System.out.println();
			count--;
		}		
		
		
	}

}
