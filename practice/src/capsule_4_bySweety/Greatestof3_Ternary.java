package capsule_4_bySweety;

public class Greatestof3_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 67;
		int b=45 ;
		int c=89;
		
		int res = (a>b && a>c )? a : (b>c)? b: c ;
		System.out.println(" Greatest no : "+ res );
	}

}
