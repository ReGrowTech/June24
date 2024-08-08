package unit_test_6;

public class Sum_And_Product {

	public static void main(String[] args) {
	
//Q10. WAP to check the sum of number is equal to product of number.
		
		int num = 321;
		int sum = 0;
		int pro = 1;
		int ld;
		
		while(num > 0)
		{
			ld = num % 10;
			num = num / 10;
			
			sum = sum + ld;
			pro = pro * ld;
		}
		
		System.out.println("Sum of the number: " + sum);
		System.out.println("Product of the number: " + pro);
		
		if(sum == pro)
		{
			System.out.println("Yes, both are equal");
		}
		else 
		{
			System.out.println("No, both are not equal");
		}

	}

}
