package string;

public class Word_Count_Using_ArrayMethod {

	public static void main(String[] args) {
		
//WAP to count word in a String using Array Method.
		
		String st = "    Hello Everyone How are you ?        ";
		st = st.trim();
	
		char arr[] = st.toCharArray();
		
		int cnt = 0;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] == ' ')
			{
				cnt++;
			}
		}
		
		System.out.println("Number of spaces : " + cnt);
		System.out.println("Number of words : " + (cnt + 1) );
	}

}
