package string;

public class Space_Count_Using_StringMethod {

	public static void main(String[] args) {
		
//WAP to count spaces in a String using String Method.
		
		String s = "       Lets celebrate the Eid        ";
		s = s.trim();

		int cnt = 0;
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			
			if(ch == ' ')
			{
				cnt++;
			}
		}
		
		System.out.println("Number of spaces are : " + cnt);
	}

}
