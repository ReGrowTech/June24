package factorialofevenNo_UserInp;

public class FactorialEven {
public static void main(String args[]) {
	int start = 2;
	int end = 10;
	
	while(start<=end) {
		if(start%2==0)
		{
			int fact = 1;
			int i = 1;
			
			while(i<=start)
			{
				fact = fact * i;
				i++;
			}
			System.out.println("Factorial of" +" "+ start + "number is" + fact);
		}
		start++;
	}
}
}