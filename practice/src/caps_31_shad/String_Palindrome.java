package caps_31_shad;

public class String_Palindrome {

	public static void main(String[] args) {
		
// WAP to check whether a String is Palindrome or not. 
	
		String st = "Madam";
		st= st.toUpperCase();
		
		char arr[] = st.toCharArray();
		String rev = "";
		
		for(int i = arr.length-1 ; i>=0 ; i--)
		{
			rev = rev + arr[i];
		}
		
		if(rev.equals(st))
		{
			System.out.println(st + " is a Palindrome String");
		}
		else
		{
			System.out.println(st + " is not a Palindrome String");
		}
		

	}

}
