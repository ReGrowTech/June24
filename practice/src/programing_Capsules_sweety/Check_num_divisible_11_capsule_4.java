package programing_Capsules_sweety;

public class Check_num_divisible_11_capsule_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num =22;
		
		int last_digit = num%10; // 
		
		String  result;
		
		result = num/11==last_digit ? " divisible by 11":" not divisible by 11 ";
		
		System.out.println(result);

	}

}
