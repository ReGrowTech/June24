package caps_22_shad;

public class Greatest_Without_Sorting {

	public static void main(String[] args) {
		
//6.WAP to find the greatest value in an array without using sorting technique.
		
		int arr[] = {56, 36, 11, 32, 13, 29, 70, 13, 10, 21};
		int grt = arr[0];
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] > grt)
			{
				grt = arr[i];
			}
		}
		
		System.out.println("Greatest value is : " + grt);

	}

}
