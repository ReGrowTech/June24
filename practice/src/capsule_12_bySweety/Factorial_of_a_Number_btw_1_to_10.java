package capsule_12_bySweety;

public class Factorial_of_a_Number_btw_1_to_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print all factorial from 1to10 all even no 
		int str =1 ;
		int end =10 ;
		while(str<=end)
		{
			if(str%2==0)
			{
				int Strt_Fact =1 ;
				int factorial = 1 ;
				
				while(Strt_Fact <= str )
				{
					factorial =factorial*Strt_Fact ;//1 
					Strt_Fact++ ;//2
				}
				System.out.println(" the factorial of "+ str + " is "+ factorial);
			}
		str++;
		}
	}
}


