package sweety_Array_practice;

public class ArrayComparison 
{
	// Non-static method to compare two arrays without using any libraries
    public boolean areArraysEqual(int[] array1, int[] array2) {
        // Check if both arrays have the same length
        if (array1.length != array2.length) 
        {
            return false;
        } 
        else
        {
            // Compare elements one by one
            for (int i = 0; i < array1.length; i++) 
            {
                if (array1[i] != array2[i]) 
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create an object of ArrayComparison and name it ob
        ArrayComparison ob = new ArrayComparison();
        
        // Example arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        
        // Use the non-static method to check if arrays are equal
        boolean areEqual = ob.areArraysEqual(array1, array2);
        
        // Output the result
        if (areEqual) {
            System.out.println("Both arrays are the same.");
        } else {
            System.out.println("The arrays are different.");
        }
    }
	

}
