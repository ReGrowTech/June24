package capsule_13_bySweety;

public class Print_all_odd_no_btw_in100_to_1 {

	public static void main(String[] args) {
		
		// print all the odd no btw 100 to 1 
		
		int str = 100;
		int end =1 ;
		
		while (str>=end)
		{
			if(str%2!=0)
			{
				System.out.print(str +" ");
			}
			str--;
		}

	}

}
