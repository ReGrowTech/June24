package sweety_program_practic;

public class Buzz_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// num , result 
		// no  divisible by 7
		// no end with 7
		// buzz no
// ans 
		int num = 77;
		
		String result =(num%7==0 || num%10==7)?" its a buzz no ":"its not a buzz no ";
		
		System.out.println(num +"  : "+ result);
	}  

}
