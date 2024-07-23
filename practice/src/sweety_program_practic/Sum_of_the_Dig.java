package sweety_program_practic;

public class Sum_of_the_Dig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num =789;
		int count=0;
		int sum =0;
		
		while(num>0)
		{
			num=num/10;// 
			count++;
			sum+=num;//
		
		}
		System.out.println(count);
		System.out.println("sum of the digit "+sum);
		
	}

}
