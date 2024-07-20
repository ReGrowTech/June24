package caps_X;

public class Odd_Numbers {

	public static void main(String[] args) {
		
// 3. WAP to print all the odds number between 30 - 70.
		
		int odd = 30;
		
		while(odd <= 70) 
		{
			if(odd % 2 !=0)
			{
				System.out.println(odd);
			}
			odd++;
		}

	}

}
