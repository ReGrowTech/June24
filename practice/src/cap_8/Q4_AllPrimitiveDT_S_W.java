package cap_8;

import java.util.Scanner;

public class Q4_AllPrimitiveDT_S_W {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter byte value");
		byte b = sc.nextByte();
		System.out.println("byte value is:" + b);
		
		System.out.println("Enter short value");
		short s = sc.nextShort();
		System.out.println("short value is:" + s);
		
		System.out.println("Enter char value");
		char ch = sc.next().charAt(0);
		System.out.println("char value is:" + ch);
		
		System.out.println("Enter int value");
		int n = sc.nextInt();
		System.out.println("int value is:" + n);
		
		System.out.println("Enter long value");
		long l = sc.nextLong();
		System.out.println("long value is:" + l);
		
		System.out.println("Enter float value");
		float f = sc.nextFloat();
		System.out.println("float value is:" + f);
		
		System.out.println("Enter double value");
		double d = sc.nextDouble();
		System.out.println("double value is:" + d);
		
		System.out.println("Enter boolean value");
		boolean bl = sc.nextBoolean();
		System.out.println("boolean value is:" + bl);
		
		System.out.println("Enter string value");
		String word = sc.next();
		System.out.println("string value is:" + word);
		sc.nextLine();
		System.out.println("Enter string value");
		String sentence = sc.nextLine();
		System.out.println("sentence value is:" + sentence);
		
		
		}
}
