package programing_Capsules_sweety;

public class Maximum_3no_ternary_capsule_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program to print the maximum of ternary operator 
		
		int a= 9;
		int b= 10 ;
		int c=20;
		
		int max = (a>b)? (a>c)?a:c : (b>c)?b:c;
		
		System.out.println(max);
	}

}
