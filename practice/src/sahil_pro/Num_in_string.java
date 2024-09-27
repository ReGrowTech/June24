package sahil_pro;

public class Num_in_string {

	public static void main(String[] args) {
		
	String str=" H no 60 line No 06";
	String newStr="";
	for(int i=0;i<str.length();i++) {
		
		char ch=str.charAt(i);
		if(Character.isDigit(ch))
		{
			newStr=newStr+ch;
		}
	}
	System.out.println("New String is="+newStr);
	}

}
