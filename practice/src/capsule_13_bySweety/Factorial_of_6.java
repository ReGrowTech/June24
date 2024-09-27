package capsule_13_bySweety;

public class Factorial_of_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 6! = 1*2*3*4*5*6
		 
		 starting = 1
		 end = 6
		 */

		int str =1;
		int ld = 6;
		int fact =1;
		while(str<=ld)
		{
			fact =fact*str ;
			str++;
		}
		
		System.out.println("Factorial of 6  is "+ fact );
	}

}
