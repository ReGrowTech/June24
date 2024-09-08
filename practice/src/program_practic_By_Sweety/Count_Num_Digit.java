package program_practic_By_Sweety;

public class Count_Num_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		
		int num =344;
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		
		}
		System.out.println(count);
	}

}
