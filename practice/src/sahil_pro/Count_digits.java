package sahil_pro;

public class Count_digits {
	
	public static void main(String args[]) {
		
		String str="H no 60 Line No 06";
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("No of Digit is ="+count);
	}
}
