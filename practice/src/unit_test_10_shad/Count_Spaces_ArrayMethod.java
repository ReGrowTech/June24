package unit_test_10_shad;

public class Count_Spaces_ArrayMethod {

	public static void main(String[] args) {
		
//Q8. WAP to count no of spaces in a String using array method.
		
		String st = "  Hello          Everyone      !     ";
		st = st.trim();
		st = st.replaceAll("\\s+" , " ") ;
		
		char arr[] = st.toCharArray();
		int cnt = 0;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] == ' ')
			{
				cnt++;
			}
		}
		System.out.println("Count of Spaces : " + cnt);

	}

}
