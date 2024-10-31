package class_test_Review_Program;

public class Nth_highest_and_Lowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	        int[] arr = {5, 6, 51, 4, 8, 2, 1, 12, 66, 13, 100, 7};

	        Nth_highest_and_Lowest obj = new Nth_highest_and_Lowest();
	        
	        int nthHighest = 3;  // For example, 3rd highest
	        int nthLowest = 4;   // For example, 4th lowest

	        // Sort the array using a non-static function
	        obj.sortArray(arr);

	        // Printing the sorted array (just for reference)
	        System.out.print("Sorted array: ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();

	        // Finding the nth highest value
	        obj.findNthHighest(arr, nthHighest);

	        // Finding the nth lowest value
	        obj.findNthLowest(arr, nthLowest);
	    }

	    // Non-static function to sort the array
	    public void sortArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] > arr[j]) {  // Ascending order
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	    }

	    // Non-static function to find the nth highest value
	    public void findNthHighest(int[] arr, int nthHighest) {
	        if (nthHighest <= arr.length) {
	            System.out.println(nthHighest + "rd highest value is: " + arr[arr.length - nthHighest]);
	        } else {
	            System.out.println("Array doesn't have enough elements for the " + nthHighest + "rd highest value.");
	        }
	    }

	    // Non-static function to find the nth lowest value
	    public void findNthLowest(int[] arr, int nthLowest) {
	        if (nthLowest <= arr.length) {
	            System.out.println(nthLowest + "th lowest value is: " + arr[nthLowest - 1]);
	        } else {
	            System.out.println("Array doesn't have enough elements for the " + nthLowest + "th lowest value.");
	        }
	    }

	}


