package sweety_program_practic;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int num =5;
		for(int row=1;row<=num;row++)
		{
			for(int colum=1;colum<=(num-row+1);colum++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}