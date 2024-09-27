package capsule_22_bySweety;

public class Product_of_aRRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= { {3,2},{4,1} ,{5,9} };
		int pr =1 ;
		for(int r=0;r<arr.length ;r++)
		{
			for(int c=0;c<arr[r].length ;c++)
			{
				pr =pr * arr[r][c];
			}
			
		}
		System.out.println("Product of the 2D array is  "+ pr );

	}

}
