package unittest1;

public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q10 WAP to print the character is alphabet ,special character or digit?
				int bc = 'z';
				String res = (bc>='A' && bc<='Z')||(bc>='a' && bc<='z')? "alphabet":(bc>='0' && bc<='9')?"digit":"special character";
				System.out.println(res);

}

}
