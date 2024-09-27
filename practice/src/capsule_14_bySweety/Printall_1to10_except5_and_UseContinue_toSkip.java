package capsule_14_bySweety;

public class Printall_1to10_except5_and_UseContinue_toSkip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int str = 1;
		int end = 10 ;
		
		while(str<=end)
		{
			if(str==5) 
			{
				str++;
				continue ;
			}
			System.out.println(str);
			str++;
		}
	}

}
