package sweety_program_practic;

public class First_no_digit_of_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =567;
		int count=0;
		
		while(num>0)
		{
			num=num/10; // 56
			count++;
			
			if(count==1)
			{
				num=num/10;
				System.out.println(" first digit  "+num);
			}
			
			
		}
	}

}
