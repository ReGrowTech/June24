package capsule_22_bySweety;

public class Print_all_even_no_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       int arr [] = {1 ,6,8,9,67,42,5};
		
       System.out.println(" Print all even no in an Array");
		for(int i = 1; i<arr.length ;i++)
		{
			if(arr[i]%2==0)
			{
				
				System.out.println(arr[i] );
			}
			
		}
	}

}
