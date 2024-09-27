package capsule_23_bySweety;

public class Find3Highest_2Lowest_val_Array
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 6, 8, 9, 4, 67, 46, 0, 35, 75, 5 };

        int ht_term = 3; // 3rd highest
        int low_term = 2; // 2nd lowest
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = i; j < a.length; j++)
            {
                if (a[i] < a[j]) // Sorting in descending order
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // Print sorted array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] );
        }
        
      
        
        // Print the 3rd highest value
        System.out.println("3rd highest value: " + a[ht_term - 1]);

        // Print the 2nd lowest value
        System.out.println("2nd lowest value: " + a[a.length - low_term]) ;
		 
	}

}
