package practice_home;
import java.util.*;

public class Pos_Neg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		String check = (n>0)? "Positive":(n<0)? "Negative":"Zero";
		System.out.println("The number is " + check);

	}

}
