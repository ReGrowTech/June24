package sahil_pro;

public class Caps_first {

	public static void main(String[] args) {

	String str="i loVe mY inDiA";
	str=" "+str;
	String newStr="";
	
	for(int i=0;i<str.length();i++) {
		
		char ch=str.charAt(i);
		if(ch==' ') {
			char ch1=str.charAt(i+1);
			newStr=newStr+" "+Character.toUpperCase(ch1);
			i++;
		}
		else {
			newStr=newStr+Character.toLowerCase(ch);
		}
	}
	System.out.println("new string is="+newStr);

	}

}
