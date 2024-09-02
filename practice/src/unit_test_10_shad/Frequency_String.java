package unit_test_10_shad;

public class Frequency_String {

	public static void main(String[] args) {
		
//Q10. WAP to find the frequency of a character using string method.
		
		String st = "helloworld";
		char arr[] = st.toCharArray();
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			int cnt = 1;
			
			if(arr[i] != '&')
			{
				for(int j = i+1 ; j <arr.length ; j++)
				{
					if(arr[i] == arr[j])
					{
						cnt++;
						arr[j] = '&';
					}
				}
				
				System.out.println(arr[i] + "--->" + cnt);
			}
		}

	}

}
