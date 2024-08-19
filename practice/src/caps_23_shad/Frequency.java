package caps_23_shad;

public class Frequency {

	public static void main(String[] args) {
		
//5. WAP to find the frequency of all the elements in an array.
		
		int arr[] = {13, 36, 11, 32, 13, 36, 70, 13, 10, 11, 36, 32};
	
		for(int i = 0 ; i < arr.length ; i++)
		{
			int cnt = 1;
			
			if(arr[i] != Integer.MAX_VALUE)
			{

				for(int j = i+1 ; j < arr.length ; j++)
				{
					if(arr[i] == arr[j])
					{
						cnt++;
						arr[j] = Integer.MAX_VALUE;
					}
				}
			
				System.out.println(arr[i] + "---> " + cnt);
			}
		}
		
	}
}


