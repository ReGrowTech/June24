package caps_23_shad;

public class Nth_Max_Min {

	public static void main(String[] args) {
		
//4. WAP to find the 3rd highest and 2 lowest value in an array. 
		
		int arr[] = {56, 36, 11, 32, 13, 29, 70, 13, 10, 21};
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
		
		System.out.println("3rd Highest value is : " + arr[arr.length - 3]);
		System.out.println("2nd Lowest value is : " + arr[1]);
		
	}

}