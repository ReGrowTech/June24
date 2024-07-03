package capsules;

public class Alpha_Num_SC {

	public static void main(String[] args) {
	
//Write a program to check the given character is an alphabet or a number or a special character. 
		
				char ch = 'S';
				
				if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
				{
					System.out.println("Its an Alphabet");
				}
				
				
				else if  (ch >= '0' &&  ch <='9')
				{
					System.out.println("Its a Number");
				}
				
				else
				{
					System.out.println("Its a Special Character");
				}

	}
}


