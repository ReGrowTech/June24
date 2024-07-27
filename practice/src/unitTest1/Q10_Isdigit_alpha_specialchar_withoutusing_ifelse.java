package unitTest1;

public class Q10_Isdigit_alpha_specialchar_withoutusing_ifelse {
	public static void main(String args[])
	{
		 char ch = '%';                                 
	     String ans = (ch>='A' && ch<='Z') || (ch>='a' && ch<='z')? "is a alphabet": (ch>=0 && ch<=9)?
	    		 "is a digit":"is a special character";
	     System.out.println(ans);

	}
}
