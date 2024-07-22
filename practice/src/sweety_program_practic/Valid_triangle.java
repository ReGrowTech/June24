package sweety_program_practic;

public class Valid_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// valid triangle 
		// sum of two side must be greater than the third side ;
		
		int s1=6;
		int s2=8;
		int s3=9;
		
		if((s1+s2>s3)&&(s1+s3>s2)&&(s2+s3>s1))
		{
			System.out.println(" its a valid triangle  - ");
		}
		else
		{
			System.out.println(" not a valid triangle  - ");
		}
	}

}
