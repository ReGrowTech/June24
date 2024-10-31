package class_test_Review_Program;

public class Declare3x3Matrix_with_all_Prime_no {

	public static void main(String[] args) {
		
		int a[][]= {{2,3,6},{5,9,2},{4,6,19}}; // 2d Array 
		
		// loop for 2d array 
		for(int r =0 ;r<a.length ;r++)
		{
			for(int c =0 ;c<a[r].length ;c++)
			{
				int cnt =0 ;
				 // loop to check which all no are prime with logic 
				for(int i =1;i<a[r][c] ;i++)
				{
					if( a[r][c]%i==0)
					{
						cnt++ ;
					}
				}
				
				if(cnt == 2 )
				{
					System.out.println(a[r][c]+" ");
				}
			}
			
		}
		
	}

}
