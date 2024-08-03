package program_practic_By_Sweety;

public class For_loop_odd_sum_no_1_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s= 1;
		int ed=20;
		int sum=0;
		for(int i=s;i<=ed;i++)
		{
			if(i%2!=0)
			{
				sum +=i;
				
			}
		}
		System.out.println("sum of all the odd numbers b/w 1 to 20 is "+sum );
		
		

	}

}
