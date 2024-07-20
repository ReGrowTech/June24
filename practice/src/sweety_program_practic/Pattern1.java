package sweety_program_practic;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =5;
		for(int row_no=1;row_no<=num;row_no++)
		{
			for( int colum_no=1;colum_no<=row_no;colum_no++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}  
	}

}
