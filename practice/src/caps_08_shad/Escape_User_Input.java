package caps_08_shad;
import java.util.*;

public class Escape_User_Input {

	public static void main(String[] args) {
		
// WAP to take user's age and name from the user and print them in two different lines. Output should be:
//	i>	My name is "ReGrow Tech". 
// ii>  And I am "24" Years old. 
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your age : ");
		int age  = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter your name : ");
		String  name = sc.nextLine();
		
		System.out.print("My name is \"" + name + "\"."+ "\n" + "And I am \"" + age + "\" Years old.");

	}

}
