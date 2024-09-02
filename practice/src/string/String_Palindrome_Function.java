package string;

//Q7. Using Non-Static Function. Check whether a String is Palindrome or not.

public class String_Palindrome_Function {

	public static void main(String[] args) {
		
		String st = "Level";
		st = st.toUpperCase();

		String_Palindrome_Function obj= new String_Palindrome_Function();
		String rev = obj.reverse(st);
		
		String_Palindrome_Function.check(rev , st);
	}
	
	public String reverse(String s)
	{
		char arr [] = s.toCharArray();
		String rev = "";
		
		for(int i = arr.length - 1 ; i >= 0 ; i-- )
		{
			rev = rev + arr[i];
		}
		return(rev);
	}
	
	public static void check(String rev , String s)
	{
		if(rev.equals(s))
		{
			System.out.println(s + " is a Palindrome");
		}
		else
		{
			System.out.println(s + " is a Palindrome");
		}
	}

}
