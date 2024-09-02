package functions_shad;

public class Arm_Cnt {

	public static int count(int n) {
		
		int cnt = 0;
		
		while(n > 0)
		{
			n = n / 10;
			cnt++;
			
		}
		return (cnt);

	}

}
