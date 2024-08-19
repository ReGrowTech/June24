package unit_test_05_shad;

public class Armstrong_For_Loop {

	public static void main(String[] args) {
		
//Q15. Write a program to check whether the number is Armstrong or not using for loop.
		
		int n = 370;
		int cnt = 0;
		
		for(int n2 = n ; n2 > 0 ; n2 = n2 / 10)
		{
			cnt++;	
		}
		
		int ld = 0;
		int sum = 0;
		
		for(int n3 = n ; n3 > 0 ; n3 = n3 / 10)
		{
			ld = n3 % 10;
			
			int pow = (int)Math.pow(ld, cnt);
			
			sum = sum + pow;
		}
		
		if(n == sum)
		{
			System.out.println(n + " is an Armstrong");
		}
			

	}

}
