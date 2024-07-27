package java_Practice;

public class Alphaordigit {

	public static void main(String[] args) {
		char ch='K';
		
		if((ch>=65&&ch<=90)||(ch>=97&&ch<=122)) {
			System.out.println(ch+" is Alphabet");
		}
		else if(ch>=0&&ch<=9) {
			System.out.println(ch+" is digit");
		}
		else {
			System.out.println(ch+" is neither digit or alphabet");
		}

	}

}
