package sahil_pro;

public class Odd_num_string {

	public static void main(String[] args) {
		
		String str=" H no 70 line No 07";
		String newStr="";
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(Character.isDigit(ch)&&(ch%2==1))
			{
				newStr=newStr+ch;
			}
		}
		System.out.println("New String is="+newStr);

	}

}
