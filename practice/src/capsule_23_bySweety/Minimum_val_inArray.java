package capsule_23_bySweety;

public class Minimum_val_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a [] = {1 ,6,8,9,4,67,46,35,75,5};
		
		// insilized
		
		int min= a[0];
		
		// for loop to go to each no 
		
		for( int i =0 ;i<a.length ;i++)
		{
			
			if( a[i]<min)
			{
				min =a[i];
			}
		}
		
		
		System.out.println(" Minimum val " + min);
	}

}
