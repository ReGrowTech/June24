package patterns_shad;

public class RHP_1_to_10 {

	public static void main(String[] args) {
		
//		1
//		2 3
//		4 5 6
//		7 8 9 10
		
		int y = 4;
		int cnt = 1;
		
		for(int r = 1 ; r <= y ; r++)
		{
			for(int c = 1 ; c <= r ; c++)
			{
				System.out.print(cnt + " ");
				cnt ++;
			}
			System.out.println();
		}

	}

}
