package caps_31_shad;

public class Space_Count_Using_ArrayMethod {

	public static void main(String[] args) {
		
// WAP to count spaces in a String using Array Method.  

		String s = "Hello everyone welcome to my Youtube Channel";
		char arr[] = s.toCharArray();
		int cnt = 0;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] == ' ')
			{
				cnt++;
			}
		}
		
		System.out.println("Number of spaces are : " + cnt);
	}

}
