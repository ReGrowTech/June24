package functions_shad;

public class Frequency_Count {

	public static void main(String[] args) {
		
//WAP to find the Frequency count of a character.
		
		String st = "helloworld";
		char arr[] = st.toCharArray();
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			int cnt = 1;
			
			if(arr[i] != '%')
			{
				for(int j = i+1 ; j < arr.length ; j++)
				{
					if(arr[i] == arr[j])
					{
						cnt++;
						arr[j] = '%';
					}
				}
				
				System.out.println(arr[i] + "---->" + cnt);
			}
		}
	}

}
