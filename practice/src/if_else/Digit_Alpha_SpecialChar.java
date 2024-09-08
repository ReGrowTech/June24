package if_else;

public class Digit_Alpha_SpecialChar {
	 public static void main(String args[]) {
		   char ch = '&';
	        if(ch>=0 && ch<=9) {
	        	System.out.println(ch + ":is a digit ");
	        }
	        else if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
	        	System.out.println(ch + ":is a alphabet");
	        }
	        else {
	        System.out.println(ch + ":is a special character");
	        }
	}
	}

