package caps_31_shad;

public class Reverse_String {

	public static void main(String[] args) {

//WAP to reverse a String.
		
		String st = "hello world";
		char arr[] = st.toCharArray();
		String rev = "";
		
		for(int i = arr.length-1 ; i>=0 ; i--)
		{
			rev = rev + arr[i];
		}
		
		System.out.println("Reveresd String : " + rev);
	}

}
