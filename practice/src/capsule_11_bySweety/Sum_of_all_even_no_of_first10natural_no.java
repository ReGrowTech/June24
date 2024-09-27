package capsule_11_bySweety;

public class Sum_of_all_even_no_of_first10natural_no {

	public static void main(String[] args) {
		
		//Sum_of_all_even_no_of_first10natural_no
		
		int str = 1;
		int end = 10;
		int sum = 0;

		while (str <= end) {
		    if (str % 2 == 0) {
		        sum = sum + str;// 2 +4 +6+8+10 =30
		    }
		    str++;
		}

		System.out.println(sum+ " is the sum ");

	}

}
