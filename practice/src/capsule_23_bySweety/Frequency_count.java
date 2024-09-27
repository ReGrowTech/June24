package capsule_23_bySweety;

class Frequency_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {9,4,7,7,2,5,9,3,5,6,21,67};
		
		for( int i =0 ;i<a.length ;i++)
		{
			int cnt =1 ;
			if(a[i]!= Integer.MAX_VALUE)
			{
				for( int j=i+1 ;j<a.length ;j++)
				{
					if( a[i]==a[j])
					{
						
					 cnt++ ;
					 a[j]=Integer.MAX_VALUE ;
					
					}
				}
				System.out.println(a[i]+"------->"+ cnt  );
			}
			
		}
	}

}
