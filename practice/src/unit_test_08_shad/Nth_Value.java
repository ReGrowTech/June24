package unit_test_08_shad;

public class Nth_Value {

	public static void main(String[] args) {
		
//8. WAP to find the 2nd highest value in an array and the 5th lowest value in an array.
		
		int arr [] = {11, 6, 2, 7, 5, 9, 3, 17, 10, 31};
		int temp;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = i ; j < arr.length ; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//After  sorting
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		
		System.out.println("2nd Highest : " + arr[arr.length - 2]);
		System.out.println("5th Lowest : " + arr[4]);
		
		
		

	}

}
