package class_test_Review_Program;

public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a []= {5,8,9,4,2,3,90,16,17} ;
		
		for( int r =0 ;r<a.length ;r++ )
		{
			//int n =a[r] ;
			int cnt =0 ;
			for( int i =1  ;i<=a[r] ;i++ )
			{
				if( a[r]%i==0)
				{
					cnt++ ;
					
				}
			}
			if(cnt==2)
			{
				System.out.println( a[r]+" ");
				
			}	
		}
	
	}

}
