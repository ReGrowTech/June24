package unit_test_07_shad;

public class Sum_Product {

	public static void main(String[] args) {
		
//Q4 WAP to check the sum of number is equal to product of number.
		
		int n = 312;
		int sum = 0;
		int pro = 1;
		int ld;
		
		while(n > 0)
		{
			ld = n % 10;
			n = n / 10;
			
			sum = sum + ld;
			pro = pro * ld;
		}
		
		if(sum == pro)
		{
			System.out.println("Sum & Product are equal");
		}
		else
		{
			System.out.println("Sum & Product are not equal");
		}
		
	}

}
