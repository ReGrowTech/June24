package capsule_20_bySweety;

public class Print_all_even_no_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       int arr [] = {1 ,6,8,9,10,102,167,349};
		
       System.out.println(" Print_all_even_no_in_an_Array");
		for(int i = 0; i<arr.length ;i++)
		{
			if(arr[i]%2==0)
			{
				
				System.out.println(" value "+arr[i] +" index "+ i);
			}
			
		}
	}

}
