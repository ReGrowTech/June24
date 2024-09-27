package capsule_14_bySweety;

public class Factorial_of_no_using_For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4 ;
		int fact =1;
		for(int i=1 ;i<=n ;i++)
		{
			fact =fact* i ;
		}
		System.out.println("Factorial of "+ n + " is "+fact );
	}

}
