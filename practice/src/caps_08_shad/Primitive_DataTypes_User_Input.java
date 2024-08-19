package caps_08_shad;
import java.util.*;

public class Primitive_DataTypes_User_Input {

	public static void main(String[] args) {
		
// Write a program to take all primitive data types value defined along with string and word. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the byte value");
		byte b = sc.nextByte();
		System.out.println("byte value : " + b);
		
		System.out.println("Enter the short value");
		short s = sc.nextShort();
		System.out.println("short value : " + s);
		
		System.out.println("Enter the character value");
		char ch = sc.next().charAt(0);
		System.out.println("character value : " + ch);
		
		System.out.println("Enter the integer value");
		int i = sc.nextInt();
		System.out.println("integer value : " + i);
		
		System.out.println("Enter the long value");
		long l = sc.nextLong();
		System.out.println("long value : " + l);

		System.out.println("Enter the float value");
		float f = sc.nextFloat();
		System.out.println("float value : " + f);
		
		System.out.println("Enter the double value");
		double d = sc.nextDouble();
		System.out.println("double value : " + d);
		
		
		System.out.println("Enter the boolean value");
		boolean bool = sc.nextBoolean();
		System.out.println("boolean value : " + bool);
	
		System.out.println("Enter a word");
		String word = sc.next();
		System.out.println(word);
		
		sc.nextLine();
		
		System.out.println("Enter a String");
		String st = sc.nextLine();
		System.out.println(st);
		
		
	}

}
