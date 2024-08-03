package program_practic_By_Sweety;

public class For_loop_even_sum_no_1_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int st =1;
		int ed= 20;
		int sum=0;
		
		for(int i= st;i<=ed;i++)// 1
		{
			if(i%2==0)// 
			{
				sum +=i;
				
			}
		}
		System.out.println(" Sum of 1 to 20 even no are "+sum);
	}

}
