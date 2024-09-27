package capsule_11_bySweety;

public class Sum_of_all_even_No_btw_20_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int str = 20;
		int end = 60;
		int sum = 0;

		while (str <= end) {
		    if (str % 2 == 0) {
		        sum = sum + str;
		    }
		    str++;
		}

		System.out.println(sum+ " is the sum ");

	}

}
