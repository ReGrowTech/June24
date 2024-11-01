package array_high_Priority_Questions_By_Sweety;

public class Find_an_Element_From_the_Array {

	public static void main(String[] args) {
		
		int arr[]= {5,7,9,0,46,8,35,78,23,905,386,56,87,52};
		int search_val =23 ;
		 boolean isFound =false ;
		 
		for(int i=0;i<arr.length;i++)
		{
			if(search_val==arr[i])
			{
				
				isFound =true ;
				
				
			}
			
		}
		
		if(isFound==true)
		{
			System.out.println("Found");
		}
		else
		{
		   System.out.println(" not found");
		}
	}

}
