package cap_6;

public class Q6_Isdigit_alpha_specChar {
	public static void main(String args[]) {
		   char ch = 'N';
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
