package capsule_11_bySweety;

public class Factorial_of_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5!=5×4×3×2×1=120
		int str =1;
		int end =5 ;
		int fact = 1;
		
		while (str<=end)
		{
			fact = fact*str ;
			str++;
			
		}
		System.out.println(" Factorial of 5 is :");
		System.out.println(" 5 ! : "+fact);
		
		
	}

}
