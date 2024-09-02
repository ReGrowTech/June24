package string;

public class String_Array_Sum {

	public static void main(String[] args) {
		
//WAP in Java take String array and find the sum all numbers. 
		
		String arr[] = { "2.872" , "5.962", "7.892"};
		double sum = 0;
		
		for(int i = 0 ; i <arr.length ; i++)
		{
			double con = Double.parseDouble(arr[i]);
			sum = sum + con;
		}
		
		System.out.printf("The sum is : %.2f", sum);

	}

}
