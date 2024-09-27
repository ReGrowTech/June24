package capsule_24_bySweety;

public class Sum_of_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]= { {3,2},{4,1} ,{5,9} };
		int sum =0 ;
		for(int r=0;r<arr.length ;r++)
		{
			for(int c=0;c<arr[r].length ;c++)
			{
				sum =sum + arr[r][c];
			}
			
		}
		System.out.println(" Sum of the 2D array is  "+ sum );
	}
}


