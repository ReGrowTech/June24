package java_Practice;

public class Grade {

	public static void main(String[] args) {
		int m=87;
		
		if(m>=91&&m<=100) {
			System.out.println("A+");
		}
		else if(m>=81) {
			System.out.println("A");
		}
		else if(m>=71) {
			System.out.println("B+");
		}
		else if(m>=61) {
			System.out.println("B");
		}
		else if(m>=51) {
			System.out.println("C");
		}
		else if(m>=41) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}

	}

}
