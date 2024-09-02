package string;

public class String_to_Char {

	public static void main(String[] args) {
		
//WAP to convert String to Char.
		
		String st = "Shadab Alam";
		char arr[] = st.toCharArray();
		
		for(int i = 0 ; i <arr.length ; i++)
		{
			System.out.print(arr[i] + "   ");
		}

	}

}
