package string;

public class Word_Count_Using_StringMethod {

	public static void main(String[] args) {
	
//WAP to count word in a String using String Method.
		
		String st = "     Hello Everyone How are you ?  ";
		st = st.trim();
		st = st.replaceAll("\\s+", " ");
		
		int cnt = 0;
		
		for(int i = 0 ; i < st.length() ; i++)
		{
			char ch = st.charAt(i);
			
			if(ch == ' ')
			{
				cnt++;
			}
		}
		
		System.out.println("Number of spaces : " + cnt);
		System.out.println("Number of words : " + (cnt + 1));
		System.out.println(st);

	}

}
