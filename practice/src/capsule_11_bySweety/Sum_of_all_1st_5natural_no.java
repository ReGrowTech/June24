package capsule_11_bySweety;

public class Sum_of_all_1st_5natural_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// natural no and its sum 
		
		int str = 1;
		int end = 5;
		int sum = 0;

		while (str <= end) {
		    
		        sum = sum + str;
		        str++;
		}

		System.out.println(sum+ "  sum of all 1st 5 natural no");
	}

}
