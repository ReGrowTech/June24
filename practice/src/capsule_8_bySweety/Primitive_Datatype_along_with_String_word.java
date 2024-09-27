package capsule_8_bySweety;

import java.util.*;

public class Primitive_Datatype_along_with_String_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Byte value  :  ");
		byte b1= sc.nextByte ();
		System.out.println(" byte value : "+b1);
		System.out.println();
		
		System.out.print("Enter Short value  :  ");
	    short s1 =sc.nextShort() ;
	    System.out.println(" short value : "+s1);
		System.out.println();
		
		System.out.print("Enter a Character  :  ");
		char ch = sc.next().charAt(0);
		System.out.println("charcter value: "+ch);
		System.out.println();
		
		System.out.print("Enter Int value  :  ");
	    int Int1 =sc.nextInt() ;
	    System.out.println(" Int value : "+Int1);
		System.out.println();
		
		System.out.print("Enter Long value  :  ");
	    long long1 =sc.nextLong() ;
	    System.out.println(" Long value : "+long1);
		System.out.println();
		
		System.out.print("Enter Float value  :  ");
	    float f1 =sc.nextFloat() ;
	    System.out.println(" Float value : "+f1);
		System.out.println();
		
		System.out.print("Enter Double value  :  ");
	    double d1 =sc.nextDouble() ;
	    System.out.println(" Double value : "+d1);
		System.out.println();
		
		System.out.print("Enter Boolen value  :  ");
	    boolean bool1 =sc.nextBoolean() ;
	    System.out.println(" Boolean value : "+bool1);
		System.out.println();
		
		sc.nextLine();
		
		System.out.print("Enter a string  :  ");
		String str = sc.nextLine();
		 System.out.println("String value : "+str);
			System.out.println();
		
		System.out.print("Enter a word   :  ");
		String word = sc.next();
	    System.out.println("String value  word : "+word);
		System.out.println();
				
			
	}

}
