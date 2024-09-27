package capsule_20_bySweety;

public class Element_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Search 4 in an capsule_20_bySweety or not 
		int arr [] = {1 ,6,8,9,4,67,46,0,35,75,5};
		int search = 4;
		boolean is_Find = false ;
		int i ;
			for( i = 0; i<arr.length ;i++)
			{
				if(search==arr[i])
				{
					
					is_Find = true ;
					break ;
				}
			}
			
			if(is_Find == true)
			{
				System.out.println(" Found " + arr[i]+ " ||  index " +i);
			}
			else
			{
				System.out.println(" Not Found "+ arr[i]+ " ||  index " + i );
			}
	}

}
