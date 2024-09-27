package capsule_25_bySweety;

public class All_diagonal_no_in_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Matrix type
		 
		8 7 1 5
		7 9 6 4
		6 3 8 3
		5 2 1 2

		 */
		// if we want the diagonal then :  o/p =>>>>>8 9 8 2
         int a[][]= {{8,7,1,5}, {7 ,9, 6, 4}, {6 ,3, 8, 3} ,{5 ,2, 1, 2}, };
		
		for(int r=0 ;r<a.length ;r++)
		{
			for(int c=0 ; c< a[r].length ; c++)
			{
				if( a[r]==a[c])
				{
					System.out.print(a[r][c]+" ");
				}
				
			}
			System.out.println();
		}

		
	}

}
