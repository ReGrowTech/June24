package program_practic_By_Sweety;

public class Count_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		// count number ;
		
		int count=0;
		int num =5587;
		
		while(num>0)
		{
		 num=num/10;
		 count++;
		}
		System.out.println(count +" Count of the number ");
	}

}
