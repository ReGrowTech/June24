package functions_shad;

public class Special_Main {

	public static void main(String[] args) {
		
		int n = 145;
		
		int sum = Special_Number.spcl(n); // calling spcl method
		
		Special_Number obj = new Special_Number();//Calling check method
		obj.check(sum, n);

	}

}
