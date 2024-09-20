package sahil_pro;

public class Sum_even_string {

	public static void main(String[] args) {
		
		
		String str=" H no 60 line No 06";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(Character.isDigit(ch)&&(ch%2==0))
			{
				sum=sum+(int)ch;
			}
		}
		System.out.println("sum of even numbers is="+sum);

	}

}
