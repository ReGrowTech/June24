package unit_test_10_shad;

public class Count_Words_StringMethod {

	public static void main(String[] args) {
	
//Q9. WAP to count no of words in a String using String method.
		
		String st = "         Welcome  to        my       Youtube   Channel    ";
		st = st.trim();
		st = st.replaceAll("\\s+" , " ") ;
		
		int cnt = 0;
		
		for(int i = 0 ; i < st.length() ; i++)
		{
			char ch = st.charAt(i);
			
			if(ch == ' ')
			{
				cnt++;
			}
		}
		System.out.println("Count of Words : " + (cnt + 1));
	}

}
