package capsule_25_bySweety;

public class Sum_of_all_diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Matrix type
		 
		8 7 1 5
		7 9 6 4
		6 3 8 3
		5 2 1 2

		 */
		// if we want the sum of diagonal then 
         int a[][]= {{8,7,1,5}, {7 ,9, 6, 4}, {6 ,3, 8, 3} ,{5 ,2, 1, 2}, };
		
         int sum =0 ;
		for(int r=0 ;r<a.length ;r++)
		{
			for(int c=0 ; c< a[r].length ; c++)
			{
				if( a[r]==a[c])
				{
				sum = sum + a[r][c] ;	
				}
				
			}
		
		}
		
		System.out.println(" sum of the diagonal is - "+sum );
	}

}
